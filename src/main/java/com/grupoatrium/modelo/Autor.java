/**
 * 
 */
package com.grupoatrium.modelo;

/**
 * Clase de definici�n de Autores
 * @author Elena
 *
 */
public class Autor {
	
	//Definimos las propiedades de clase
	private String nombre;
	private String nacionalidad;
	private String comentarios;
	
	
	
	/**
	 * @param nombre
	 * @param nacionalidad
	 * @param comentarios
	 */
	public Autor(String nombre, String nacionalidad, String comentarios) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.comentarios = comentarios;
	}

	//--------------M�todos de acceso y modificaci�n-------------

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	
	//M�todo de prueba de inyecciones
	@Override
	public String toString() {
		return "[Nombre: "+nombre
				+"; Nacionalidad: "+nacionalidad
				+"; Comentarios: "+comentarios+"]";
	}


}
