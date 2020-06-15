package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Usuario;

public interface IUsuarioService {

	/**
	 * interfas para guardar datos
	 */
	public void guardar();
	/**
	 * interfas que recupera datos
	 */
	public Usuario mostrar();
	/**
	 * interfas para eliminar datos
	 */
	public void Eliminar();
	/**
	 * interfas para modificar datos
	 */
	public Usuario modificar();
}
