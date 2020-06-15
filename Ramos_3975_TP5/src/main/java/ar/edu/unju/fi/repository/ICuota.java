package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Cuota;

public interface ICuota {

	/**
	 * interfas para crear cuotas
	 */
	public void crear();
	/**
	 * interfas par mostrar los datos de la cuota
	 */
	public Cuota mostrar();
	/**
	 * interfas para eliminar la cuota en caso
	 * de un pago efectivo
	 */
	public void Eliminar();
	/**
	 * interfas praa modificar el monto
	 */
	public Cuota modificarMonto();
	
}
