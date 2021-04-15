package arquisoft.usuario_ms.models.repository;

import org.springframework.data.repository.CrudRepository;

import arquisoft.usuario_ms.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);
}
