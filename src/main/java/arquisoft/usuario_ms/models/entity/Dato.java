package arquisoft.usuario_ms.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "datos")
public class Dato implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_dato;

	@Column(unique = true)
	private Long cedula_dato;
	
	
	private Long telefono_dato;
	private String nombre_dato;
	private String apellido_dato;

	@Column(unique = true)
	private String email_dato;
	
	@OneToOne
	private Usuario usuario;	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getId_dato() {
		return id_dato;
	}

	public void setId_dato(Long id_dato) {
		this.id_dato = id_dato;
	}

	public Long getCedula_dato() {
		return cedula_dato;
	}

	public void setCedula_dato(Long cedula_dato) {
		this.cedula_dato = cedula_dato;
	}

	public Long getTelefono_dato() {
		return telefono_dato;
	}

	public void setTelefono_dato(Long telefono_dato) {
		this.telefono_dato = telefono_dato;
	}

	public String getNombre_dato() {
		return nombre_dato;
	}

	public void setNombre_dato(String nombre_dato) {
		this.nombre_dato = nombre_dato;
	}

	public String getApellido_dato() {
		return apellido_dato;
	}

	public void setApellido_dato(String apellido_dato) {
		this.apellido_dato = apellido_dato;
	}

	public String getEmail_dato() {
		return email_dato;
	}

	public void setEmail_dato(String email_dato) {
		this.email_dato = email_dato;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
