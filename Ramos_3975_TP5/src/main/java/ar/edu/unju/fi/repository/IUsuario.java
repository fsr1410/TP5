package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Usuario;

public interface IUsuario {
	
	/**
	 * interfas para guardar datos
	 */
	public void guardar();
	/**
	 * interfas para mostrar los datos un usuario
	 */
	public Usuario mostrar();
	/**
	 * interfas para eliminar datos
	 */
	public void Eliminar();
	/**
	 * interfas para modificar los datos de un usuario
	 */
	public Usuario modificar();
	
}
