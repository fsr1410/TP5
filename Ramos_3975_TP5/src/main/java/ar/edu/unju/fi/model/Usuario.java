package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Usuario{
	/**
	 * codigo de identificacion del usuario
	 */
	private long id;
	/**
	 * nombre del usuario
	 */
	private String nombre;
	/**
	 * apellido del usuario
	 */
	private String apellido;
	/**
	 * fecha de nacimineto del usuario ,
	 * puede servir para determinar la edad del usuario
	 */
	private LocalDate fechaNacimiento;
	/**
	 * direccion del usuario
	 */
	private String direccion;
	/**
	 * cedula de identificación personal. 
	 */
	private long dni;
	/**
	 * fecha de suscripcion
	 */
	private LocalDate fechaAlta;
	/**
	 * tipo de usuaruio,
	 * puede ser
	 * - SOCIO.
	 * - ADMIN.
	 * - CONSULTOR (visitante no registrado dento de la pagina)
	 */
	private String tipo; //yo utilisaria el tipo de datos int definiendo su vez prioridades
	/**
	 * representa la contraseña contraseña por usuario
	 */
	private String password;
	
	//---------------CONSTRUCTORES---------------
		/**
		 * constructor por defecto
		 */
		@Autowired
		public Usuario() {
			// TODO Auto-generated constructor stub
		}
	
	/**
	 * constructor parametrizado  o sobrecargado
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param direccion
	 * @param dni
	 * @param fechaAlta
	 * @param tipo
	 * @param password
	 */
	public Usuario(long id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, long dni,
			LocalDate fechaAlta, String tipo, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
		this.tipo = tipo;
		this.password = password;
	}

	//-------------METODOS ACCESORES-------------
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the dni
	 */
	public long getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}

	/**
	 * @return the fechaAlta
	 */
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNacimiento
				+ ", fechaAlta=" + fechaAlta + ", direccion=" + direccion + ", dni=" + dni + ", tipo=" + tipo
				+ ", password=" + password+"]";
	}

		
}
