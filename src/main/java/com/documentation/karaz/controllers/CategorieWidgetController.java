package com.documentation.karaz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.documentation.karaz.models.CategorieWidget;
import com.documentation.karaz.repository.CategorieWidgetRepository;

@RestController
@CrossOrigin( )
public class CategorieWidgetController {

    @Autowired
    CategorieWidgetRepository categorieWidgetRepository;

    @GetMapping( "/categorie" )
    public List<CategorieWidget> getCategorieWidget() {
        return categorieWidgetRepository.findAll();
    }

}
