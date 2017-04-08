package com.grupoatrium.cliente;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.grupoatrium.modelo.Libro;
import com.grupoatrium.persistencia.impl.ConnectionMgr;
import com.grupoatrium.persistencia.impl.EditorialesDAO;
import com.grupoatrium.persistencia.impl.LibrosDAO;

/**
 * Clase de inicio de la aplicación
 * 
 * @author Elena
 *
 */
public class AppMain {

	public static void main(String[] args) {
		/*
		 * Levantar el contexto de Spring Crear el contenedor de beans a partir
		 * de la clase de configuración
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(com.grupoatrium.configuracion.ClaseConfig.class);

		// Recuperar del contenedor los beans
		Libro libro = context.getBean("libro", Libro.class);
		ConnectionMgr connection = context.getBean("connectionMgr", ConnectionMgr.class);
		LibrosDAO librosDAO = context.getBean("librosDAO", LibrosDAO.class);
		EditorialesDAO editorialesDAO = context.getBean("editorialesDAO", EditorialesDAO.class);

		//Imprimimos las propiedades de todos los beans por pantalla
		System.out.println("Propiedades de Libro:\n"+libro.toString());
		System.out.println("Propiedades de ConnectionMgr:\n   "+connection.toString());
		System.out.println("Propiedades de LibrosDAO:\n   "+librosDAO.toString());
		System.out.println("Propiedades de EditorialesDAO:\n   "+editorialesDAO.toString());

		//Cerramos el contexto de Spring
		((ConfigurableApplicationContext) context).close();

	}

}
