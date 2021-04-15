package arquisoft.usuario_ms.models.repository;

import org.springframework.data.repository.CrudRepository;

import arquisoft.usuario_ms.models.entity.Dato;

public interface IDatoDao extends CrudRepository<Dato, Long> {
	
	
	
}
