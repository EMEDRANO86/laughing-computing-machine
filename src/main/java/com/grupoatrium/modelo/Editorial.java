/**
 * 
 */
package com.grupoatrium.modelo;

/**
 * Clase de definición de Editorial
 * @author Elena
 *
 */
public class Editorial {

	// Definimos las propiedades de clase
	private String nombre;
	private Direccion direccion;
	private String nif;

	//--------------Métodos de acceso y modificación-------------

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

	// Método de prueba de inyecciones
	@Override
	public String toString() {
		return "[Nombre: " + nombre + "; Dirección: " + direccion.toString() + "; Nif: " + nif + "]";
	}

}
