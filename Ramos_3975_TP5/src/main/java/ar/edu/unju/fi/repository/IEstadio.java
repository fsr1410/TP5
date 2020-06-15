package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Estadio;

public interface IEstadio {
	/**
	 * interfas para guardar datos del estadio
	 */
	public void guardar();
	/**
	 * interfas para mostrar los datos del estadio
	 */
	public Estadio mostrar();
	/**
	 * interfas para eliminar datos del estadio
	 */
	public void Eliminar();
	/**
	 * interfas para modificar los datos del estadio
	 */
	public Estadio modificar();
	
}
