package com.documentation.karaz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.documentation.karaz.models.WidgetBackEnd;

@CrossOrigin( )
@RestController
public class WidgetRestController {

    @Autowired
    private com.documentation.karaz.repository.WidgetBackEndRepository widgetBackEndRepository;

    @PreAuthorize( "hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')" )
    @GetMapping( value = "/getWidgete", produces = "application/json" )
    public List<WidgetBackEnd> getAllWidget() {
        return widgetBackEndRepository.findAll();
    }

    @GetMapping( value = "/getWidgetCode/{id}", produces = "application/json" )

    public ResponseEntity<WidgetBackEnd> getSingle( @PathVariable( "id" ) Long widgetId ) throws Exception {
        WidgetBackEnd widgetBackEnd = widgetBackEndRepository.findById( widgetId )
                .orElseThrow( () -> new Exception() );
        return ResponseEntity.ok().body( widgetBackEnd );
    }

    @PutMapping( value = "/updateWidgetCode/{id}" )
    public ResponseEntity<WidgetBackEnd> updateCode( @PathVariable( "id" ) Long widgetId,
            @RequestBody String code )
            throws Exception {
        WidgetBackEnd widgetBackEnd = widgetBackEndRepository.findById( widgetId )
                .orElseThrow( () -> new Exception() );

        widgetBackEnd.setCodewidget( code );
        final WidgetBackEnd updateCodes = widgetBackEndRepository.save( widgetBackEnd );
        return ResponseEntity.ok( updateCodes );

    }

    @PutMapping( value = "/updateWidgetImage/{id}" )
    public void updataImage( @PathVariable( value = "id" ) Long id, @RequestBody String image ) throws Exception {
        WidgetBackEnd widgetBackEnd = widgetBackEndRepository.findById( id )
                .orElseThrow( () -> new Exception() );
        widgetBackEnd.setImage( image );
        widgetBackEndRepository.save( widgetBackEnd );

    }

}
