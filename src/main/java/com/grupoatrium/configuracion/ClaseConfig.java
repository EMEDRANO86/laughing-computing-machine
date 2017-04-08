package com.grupoatrium.configuracion;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.grupoatrium.modelo.Autor;
import com.grupoatrium.modelo.Direccion;
import com.grupoatrium.modelo.Editorial;
import com.grupoatrium.modelo.Libro;
import com.grupoatrium.persistencia.impl.ConnectionMgr;
import com.grupoatrium.persistencia.impl.EditorialesDAO;
import com.grupoatrium.persistencia.impl.LibrosDAO;


//Activar un fichero de properties u otro según entorno de ejecución
@Configuration
@ComponentScan(basePackages="com.grupoatrium")
@PropertySource(value = "classpath:config/data-source-test.properties")
//@PropertySource(value = "classpath:config/data-source.properties")
//@ImportResource("applicationContext-properties.xml")
public class ClaseConfig {
	
	@Value("${driver}")
	private String driver;
	
	@Value("${url}")
	private String url;
	
	@Value("${user}")
	private String usuario;
	
	@Value("${pw}")
	private String password;
	
	@Bean
	public Libro libro(){
		Libro libro = new Libro();
		libro.setAutores(Arrays.asList(autor1(),autor2()));
		libro.setEditorial(editorial());
		libro.setDescripcion("Thriller");
		libro.setIsbn("9788499085739");
		libro.setPrecio(19.95);
		libro.setPublicacion(3);
		libro.setTitulo("La última respuesta");
		return libro;
	}
	
	@Bean
	public Editorial editorial(){
		Editorial editorial = new Editorial();
		editorial.setDireccion(direccion());
		editorial.setNif("89698798V");
		editorial.setNombre("DEBOLSILLO");
		return editorial;
	}
	
	@Bean
	public Direccion direccion(){
		Direccion direccion = new Direccion();
		direccion.setCalle("Avinguda del Remolar");
		direccion.setNumero(109);
		direccion.setPoblacion("El Prat de Llobregat");
		direccion.setCp(8820);
		direccion.setPoblacion("Barcelona");		
		return direccion;
	}
	
	@Bean
	public Autor autor1(){
		return new Autor("Alex Rovira", "Española", "Nacido en Barcelona");

	}
	
	@Bean
	public Autor autor2(){
		return new Autor("Francesc Miralles", "Española", "Nacido en Barcelona");
	}
	
	// Métodos de Ciclo de Vida
	@PostConstruct
	public void init() {
		System.out.println("Metodo Init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Método Destroy");
	}
	
	@Bean
	public ConnectionMgr connectionMgr() {
		return new ConnectionMgr(driver, url, usuario, password);
	}
	
	@Bean
	public LibrosDAO librosDAO() {
		return new LibrosDAO(connectionMgr());
	}
	
	@Bean
	public EditorialesDAO editorialesDAO() {
		return new EditorialesDAO(connectionMgr());
	}
}

