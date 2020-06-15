package ar.edu.unju.fi.model;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component

public class Resultado{
	
	/**
	 * representa la fecha del resultado del partido
	 */
	private LocalDate fecha;
	/**
	 * Representa un equipo que jugo
	 */
	@Autowired
	private Equipo equipo1;
	/**
	 * Representa un equipo que jugo
	 */
	@Autowired
	private Equipo equipo2;
	/**
	 * respresenta el numero de goles de un equipo
	 */
	private int golesEquipo1;
	/**
	 * respresenta el numero de goles de un equipo
	 */
	private int golesEquipo2;
	
	//---------------CONSTRUCTORES---------------
	/**
	 * constructor por defecto
	 */
	@Autowired
	public Resultado() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * constrcutor parametrisado
	 * @param fecha
	 * @param equipo1
	 * @param equipo2
	 * @param golesEquipo1
	 * @param golesEquipo2
	 */
	public Resultado(LocalDate fecha, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		super();
		this.fecha = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
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
	 * @return the equipo1
	 */
	public Equipo getEquipo1() {
		return equipo1;
	}
	/**
	 * @param equipo1 the equipo1 to set
	 */
	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}
	/**
	 * @return the equipo2
	 */
	public Equipo getEquipo2() {
		return equipo2;
	}
	/**
	 * @param equipo2 the equipo2 to set
	 */
	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}
	/**
	 * @return the golesEquipo1
	 */
	public int getGolesEquipo1() {
		return golesEquipo1;
	}
	/**
	 * @param golesEquipo1 the golesEquipo1 to set
	 */
	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}
	/**
	 * @return the golesEquipo2
	 */
	public int getGolesEquipo2() {
		return golesEquipo2;
	}
	/**
	 * @param golesEquipo2 the golesEquipo2 to set
	 */
	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	
}
