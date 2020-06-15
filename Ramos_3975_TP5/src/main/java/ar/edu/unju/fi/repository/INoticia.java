package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Noticia;

public interface INoticia {
	/**
	 * crea una nueva noticia
	 */
	public void crear();
	/**
	 * elimina una noticia
	 */
	public void eliminar();
	/**
	 * modifica el resumen de una noticia
	 * @return la noticia modificada
	 */
	public Noticia modificarResumen();
	/**
	 * modifica el titulo de la noticia
	 * @return la noticia modificda
	 */
	public Noticia modificarTitulo();
}
