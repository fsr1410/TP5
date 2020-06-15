package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuario;
import ar.edu.unju.fi.service.IUsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * el tp5 decia que devia poner @repository
 * pero era un servicio asi que decidi ponerle @service
 */
@Service 
public class UsuarioServiceImp implements IUsuarioService{

	@Autowired
	private IUsuario iusuario;
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		iusuario.guardar();
	}

	@Override
	public Usuario mostrar() {
		// TODO Auto-generated method stub
		Usuario usuario = iusuario.mostrar();
		return usuario;
	}

	@Override
	public void Eliminar() {
		// TODO Auto-generated method stub
		iusuario.Eliminar();
	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		Usuario usuario = iusuario.modificar();
		return usuario;
	}

}
