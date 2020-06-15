package ar.edu.unju.fi.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Usuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Long id;
	@Column
	@NotBlank
	private String nombre;
	@Column
	@NotBlank(message="El Apellido no puede quedar en blanco")
	private String apellido;
	@Column	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate fechaNac;
	@Column
	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate fechaAlta;
	@Column
	private String direccion;
	@Column
	private long dni;
	@Column
	@NotBlank
	private String tipo;
	@Column
	@NotBlank
	@Size(min=8, message="Su contraseña debe tener como mínimo 8 caracteres")
	private String password;	
	
	@OneToMany(mappedBy ="socio", cascade = CascadeType.ALL)
	private List<Cuota> cuotas = new ArrayList<Cuota>();
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(Long id, @NotBlank String nombre,
			@NotBlank(message = "El Apellido no puede quedar en blanco") String apellido, LocalDate fechaNac,
			@NotNull LocalDate fechaAlta, String direccion, long dni, @NotBlank String tipo,
			@NotBlank @Size(min = 8, message = "Su contraseña debe tener como mínimo 8 caracteres") String password,
			List<Cuota> cuotas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNac = fechaNac;
		this.fechaAlta = fechaAlta;
		this.direccion = direccion;
		this.dni = dni;
		this.tipo = tipo;
		this.password = password;
		this.cuotas = cuotas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Cuota> getCuotas() {
		return cuotas;
	}

	public void setCuotas(List<Cuota> cuotas) {
		this.cuotas = cuotas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((cuotas == null) ? 0 : cuotas.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + (int) (dni ^ (dni >>> 32));
		result = prime * result + ((fechaAlta == null) ? 0 : fechaAlta.hashCode());
		result = prime * result + ((fechaNac == null) ? 0 : fechaNac.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (cuotas == null) {
			if (other.cuotas != null)
				return false;
		} else if (!cuotas.equals(other.cuotas))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (dni != other.dni)
			return false;
		if (fechaAlta == null) {
			if (other.fechaAlta != null)
				return false;
		} else if (!fechaAlta.equals(other.fechaAlta))
			return false;
		if (fechaNac == null) {
			if (other.fechaNac != null)
				return false;
		} else if (!fechaNac.equals(other.fechaNac))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac
				+ ", fechaAlta=" + fechaAlta + ", direccion=" + direccion + ", dni=" + dni + ", tipo=" + tipo
				+ ", password=" + password + ", cuotas=" + cuotas + "]";
	}

		
}
