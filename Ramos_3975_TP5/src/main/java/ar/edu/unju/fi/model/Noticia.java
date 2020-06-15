/**
 * 
 */
package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Representa una noticia dela 
 * Liga de Futbol
 * @author Sebastian
 *
 */
@Component
public class Noticia{
	
	/**
	 * Fecha de la noticia
	 */
	private LocalDate fecha;
	
	/**
	 * Titulo de la noticia
	 */
	private String titulo;
	
	/**
	 * Resumen de la noticia
	 */
	private String resumen;

	//---------------CONSTRUCTORES---------------
	
	/**
	 * construcctor parametrisado
	 * @param fecha
	 * @param titulo
	 * @param resumen
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		super();
		this.fecha = fecha;
		this.titulo = titulo;
		this.resumen = resumen;
	}
	
	/**
	 * consttructor por defecto
	 */
	@Autowired
	public Noticia() {
		// TODO Auto-generated constructor stub
	}
	
	//-------------METODOS ACCESORES-------------
	
	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	
}
