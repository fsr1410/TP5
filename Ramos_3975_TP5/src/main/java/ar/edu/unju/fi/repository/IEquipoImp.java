package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Ramos3975Tp5Application;

@Repository
public class IEquipoImp implements IEquipo{
	
	public static Logger LOG = LoggerFactory.getLogger(Ramos3975Tp5Application.class);
	
	@Override
	public void cambiarNombre() {
		// TODO Auto-generated method stub
		/**
		 * cambia datos
		 */
		LOG.info("Los datos fueron cambiados...");
	}

	@Override
	public void crear() {
		// TODO Auto-generated method stub
		/**
		 * crea un registro nuevo;
		 */
		LOG.info("Datos creados");
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		/**
		 * Datos eliminados
		 */
		LOG.info("Los datos fueron eliminados");
	}

}
