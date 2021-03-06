package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Ramos3975Tp5Application;
import ar.edu.unju.fi.model.Estadio;

@Repository
public class IEstadioImp implements IEstadio{

	@Autowired
	private Estadio iestadio;
	
	public static Logger LOG = LoggerFactory.getLogger(Ramos3975Tp5Application.class);
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		/**
		 * guarda unn obecto usuario en la "base de datos"
		 */
		LOG.info("El usuario fue guardado " + iestadio.getNombre());
	}

	@Override
	public Estadio mostrar() {
		// TODO Auto-generated method stub
		/**
		 * muestra los datos del usuario
		 */
		return iestadio;
	}

	@Override
	public void Eliminar() {
		// TODO Auto-generated method stub
		/**
		 * elimina el objeto usuario de la "base de datos"
		 */
		
		LOG.info("Se eliminó el usuario de la bd");
	}

	@Override
	public Estadio modificar() {
		// TODO Auto-generated method stub
		/**
		 * modifica los datos del objeto usuario
		 */
		LOG.info("Se modificaron los datos del usuario ");
		return iestadio;
	}
}
