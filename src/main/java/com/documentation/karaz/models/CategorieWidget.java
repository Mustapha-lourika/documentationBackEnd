package com.documentation.karaz.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
public class CategorieWidget {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )

    private Long   id;
    private String nomcat;

    public CategorieWidget() {
        // TODO Auto-generated constructor stub
    }

    public CategorieWidget( Long id, String nomcat ) {
        super();
        this.id = id;
        this.nomcat = nomcat;
    }

    public CategorieWidget( Long id, String nomcat, Set<Widget> widgets ) {
        super();
        this.id = id;
        this.nomcat = nomcat;
        this.widgets = widgets;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getNomcat() {
        return nomcat;
    }

    public void setNomcat( String nomcat ) {
        this.nomcat = nomcat;
    }

    public Set<Widget> getWidgets() {
        return widgets;
    }

    public void setWidgets( Set<Widget> widgets ) {
        this.widgets = widgets;
    }

    @OneToMany( cascade = CascadeType.ALL, mappedBy = "categorieWidget" )

    private Set<Widget> widgets = new HashSet<>();
}
