package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Ramos3975Tp5Application;
import ar.edu.unju.fi.model.Noticia;

@Repository
public class INoticiaImp implements INoticia{

	@Autowired
	private Noticia noticia;
	
	public static Logger LOG = LoggerFactory.getLogger(Ramos3975Tp5Application.class);
	
	@Override
	public void crear() {
		// TODO Auto-generated method stub
		LOG.info("Se creo una noticia: "+ noticia.getTitulo() );
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("La noticia \""+noticia.getTitulo()+"\" fue eliminada");
	}

	@Override
	public Noticia modificarResumen() {
		// TODO Auto-generated method stub
		/**
		 * modificacion del resumen
		 */
		LOG.info("Resumen modificado...");
		return null;
	}

	@Override
	public Noticia modificarTitulo() {
		// TODO Auto-generated method stub
		/**
		 * modificacion del titulo
		 */
		LOG.info("Titulo modificado...");
		return null;
	}
	

	
}
