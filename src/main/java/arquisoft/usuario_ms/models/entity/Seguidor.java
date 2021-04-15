package arquisoft.usuario_ms.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "seguidores")
public class Seguidor implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "seguidor")
	private Dato seguidor;
	
	@ManyToOne
	@JoinColumn(name = "seguido")
	private Dato seguido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Dato getSeguidor() {
		return seguidor;
	}

	public void setSeguidor(Dato seguidor) {
		this.seguidor = seguidor;
	}


	

	public Dato getSeguido() {
		return seguido;
	}

	public void setSeguido(Dato seguido) {
		this.seguido = seguido;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
