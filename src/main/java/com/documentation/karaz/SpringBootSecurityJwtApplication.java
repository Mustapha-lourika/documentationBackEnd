package com.documentation.karaz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.documentation.karaz.repository.CategorieWidgetRepository;
import com.documentation.karaz.repository.WidgetRepository;

@SpringBootApplication
public class SpringBootSecurityJwtApplication implements CommandLineRunner {
    @Autowired
    CategorieWidgetRepository categorieWidgetRepository;
    @Autowired
    WidgetRepository          widgetRepository;

    public static void main( String[] args ) {
        SpringApplication.run( SpringBootSecurityJwtApplication.class, args );
    }

    @Override
    public void run( String... args ) throws Exception {
        /*
         * CategorieWidget categorieWidget = new CategorieWidget( 1L,
         * "Fields(Champs)" ); Widget widget = new Widget( "fields 1", "code" );
         * Widget widget2 = new Widget( "fiels 2", "code" ); Widget widget3 =
         * new Widget( "fields 3", "code" ); categorieWidget.getWidgets().add(
         * widget ); categorieWidget.getWidgets().add( widget2 );
         * categorieWidget.getWidgets().add( widget3 );
         * 
         * categorieWidgetRepository.save( categorieWidget );
         */
        // categorieWidgetRepository.save( new CategorieWidget( 2L,

    }

}
