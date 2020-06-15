package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Ramos3975Tp5Application;
import ar.edu.unju.fi.model.Cuota;

@Repository
public class ICuotaImp implements ICuota{

	@Autowired
	private Cuota cuota;
	
	public static Logger LOG = LoggerFactory.getLogger(Ramos3975Tp5Application.class);

	@Override
	public void crear() {
		// TODO Auto-generated method stub
		/**
		 * creacion de una nueva cuota
		 */
		LOG.info("Se creo una Cuota: "+ cuota.getId() );
	}

	@Override
	public Cuota mostrar() {
		// TODO Auto-generated method stub
		/**
		 * muestra datos de una cuota
		 */
		LOG.info(cuota.toString());
		return null;
	}

	@Override
	public void Eliminar() {
		// TODO Auto-generated method stub
		/**
		 * elima la cuota en caso del pago efectuado
		 */
		LOG.info("Se eliminó una cuota: "+cuota.getId());
	}

	@Override
	public Cuota modificarMonto() {
		// TODO Auto-generated method stub
		LOG.info("Se modifico el monto de la cuota: "+cuota.getId()+"%s monto a pagar= $"+cuota.getMonto());
		return null;
	}
	
}
