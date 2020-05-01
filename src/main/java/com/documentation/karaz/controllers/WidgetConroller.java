package com.documentation.karaz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.documentation.karaz.models.Widget;
import com.documentation.karaz.repository.WidgetRepository;

@RestController
@CrossOrigin( )

public class WidgetConroller {
    @Autowired
    private WidgetRepository widgetrepo;

    @GetMapping( "/widgetss/{categorie}" )
    public List<Widget> getAllWidgetss( @PathVariable( "categorie" ) String cat ) {
        // String d = "ok";
        // widgetrepo.save( new Widget( d, "d" ) );

        return widgetrepo.findByCategorieWidgetNomcat( cat );

    }

}
