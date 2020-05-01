package com.documentation.karaz.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.documentation.karaz.models.Widget;

public interface WidgetRepository extends JpaRepository<Widget, Long> {
    Optional<Widget> findByNamewidget( String name );

    List<Widget> findByCategorieWidgetId( Long id );

    List<Widget> findByCategorieWidgetNomcat( String name );
}
