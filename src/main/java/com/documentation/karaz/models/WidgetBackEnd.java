package com.documentation.karaz.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class WidgetBackEnd {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long   id_code;
    private String titre;
    private String description;

    @Lob

    private String codewidget;
    private String image;

    public WidgetBackEnd() {
        // TODO Auto-generated constructor stub
    }

    public WidgetBackEnd( Long id_code, String titre, String description, String codewidget, String image ) {
        super();
        this.id_code = id_code;
        this.titre = titre;
        this.description = description;
        this.codewidget = codewidget;
        this.image = image;
    }

    public Long getId_code() {
        return id_code;
    }

    public void setId_code( Long id_code ) {
        this.id_code = id_code;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre( String titre ) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public String getCodewidget() {
        return codewidget;
    }

    public void setCodewidget( String codewidget ) {
        this.codewidget = codewidget;
    }

    public String getImage() {
        return image;
    }

    public void setImage( String image ) {
        this.image = image;
    }

}
