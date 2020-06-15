package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Equipo{
	
	@Autowired
	private String nombre;
	
	@Autowired
	private Estadio estadio;
	
	
	
	//---------------CONSTRUCTORES---------------
	/**
	 * @param estadio
	 */
	public Equipo(Estadio estadio) {
		this.estadio = estadio;
	}
	
	@Autowired
	public Equipo() {
		// TODO Auto-generated constructor stub
	}
	
	//-------------METODOS ACCESORES-------------

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}

	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + "]";
	}
	
}