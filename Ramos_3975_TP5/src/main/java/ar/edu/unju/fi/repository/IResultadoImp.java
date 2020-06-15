package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Ramos3975Tp5Application;
import ar.edu.unju.fi.model.Resultado;

@Repository
public class IResultadoImp implements IResultado{

	@Autowired
	private Resultado iresultado;
	
	public static Logger LOG = LoggerFactory.getLogger(Ramos3975Tp5Application.class);
	
	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		/**
		 * muestra los datos
		 */
		LOG.info("Fecha= "+iresultado.getFecha()+" - Ganador= "+eGanador());
	}
	
	/** 
	 * determina el resultado del partido
	 * @return el ganador
	 */
	private String eGanador() {
		if (iresultado.getGolesEquipo1()==iresultado.getGolesEquipo2())
			return "Empate";
		else if (iresultado.getGolesEquipo1()>iresultado.getGolesEquipo2())
			return iresultado.getEquipo1().getNombre();
			else return iresultado.getEquipo2().getNombre();
		
	}
	
	@Override
	public Resultado modificar() {
		// TODO Auto-generated method stub
		/**
		 * modifica los datos de la seccion resltados
		 */
		Resultado resultado = iresultado;
		LOG.info("Datos modificados= ");
		return resultado;
	}

}
