package com.grupoatrium.persistencia.impl;

/**
 * Clase DAO para Libros
 * @author Elena
 *
 */
public class LibrosDAO {
	
	//Propiedades de clase
	private ConnectionMgr connectionMgr;
	
	

	/**
	 * @param connectionMgr
	 */
	public LibrosDAO(ConnectionMgr connectionMgr) {
		this.connectionMgr = connectionMgr;
	}

	//--------------M�todos de acceso y modificaci�n-------------
	
	public ConnectionMgr getConnectionMgr() {
		return connectionMgr;
	}

	public void setConnectionMgr(ConnectionMgr connectionMgr) {
		this.connectionMgr = connectionMgr;
	}
	
	// M�todo de prueba de inyecciones
	@Override
	public String toString() {
		return connectionMgr.toString();
	}
	
	

}
