package com.documentation.karaz.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Widget {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long   id;
    private String namewidget;

    @Lob
    private String codeWidget;

    public Widget( String namewidget, String codeWidget ) {
        super();
        this.namewidget = namewidget;
        this.codeWidget = codeWidget;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getNamewidget() {
        return namewidget;
    }

    public String getCodeWidget() {
        return codeWidget;
    }

    public void setCodeWidget( String codeWidget ) {
        this.codeWidget = codeWidget;
    }

    public CategorieWidget getCategorieWidget() {
        return categorieWidget;
    }

    public void setCategorieWidget( CategorieWidget categorieWidget ) {
        this.categorieWidget = categorieWidget;
    }

    public Widget() {
        // TODO Auto-generated constructor stub
    }

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "categorie_id" )
    @JsonIgnore
    private CategorieWidget categorieWidget;
}
