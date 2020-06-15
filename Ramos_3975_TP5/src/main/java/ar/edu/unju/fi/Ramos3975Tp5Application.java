package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Ramos3975Tp5Application implements CommandLineRunner{
	
	
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	
	public static void main(String[] args) {
		SpringApplication.run(Ramos3975Tp5Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		usuario.setApellido("Ramos");
		usuario.setDireccion("Av Mitre 256");
		usuario.setDni(42035292);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1999, 11, 12));
		usuario.setId((long)1);
		usuario.setNombre("Sebastian");
		usuario.setPassword("C0n3j0");
		usuario.setTipo("socio");
		usuarioService.guardar();
	}

}
