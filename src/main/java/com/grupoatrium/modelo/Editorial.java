/**
 * 
 */
package com.grupoatrium.modelo;

/**
 * Clase de definici�n de Editorial
 * @author Elena
 *
 */
public class Editorial {

	// Definimos las propiedades de clase
	private String nombre;
	private Direccion direccion;
	private String nif;

	//--------------M�todos de acceso y modificaci�n-------------

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	// M�todo de prueba de inyecciones
	@Override
	public String toString() {
		return "[Nombre: " + nombre + "; Direcci�n: " + direccion.toString() + "; Nif: " + nif + "]";
	}

}
