package arquisoft.usuario_ms.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import arquisoft.usuario_ms.models.entity.Dato;
import arquisoft.usuario_ms.models.entity.Seguidor;

public interface ISeguidorDao extends CrudRepository<Seguidor, Long> {
	
	public List<Seguidor> findAllBySeguidor(Dato seguidor);
	
	public List<Seguidor> findAllBySeguido(Dato seguido);
	
	@Query("delete from Seguidor s where s.seguidor=?1 and s.seguido=?2")
	public void deleteSeguidor(Dato seguidor, Dato seguido);
	

}
