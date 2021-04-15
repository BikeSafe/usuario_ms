package arquisoft.usuario_ms.models.service;

import java.util.List;

import arquisoft.usuario_ms.models.entity.Dato;
import arquisoft.usuario_ms.models.entity.Seguidor;

public interface IDatoService {
	
	public List<Dato> findAll();
	
	public Dato findById(Long id);
	
	public Dato create(Dato dato);
	
	public Dato update(Dato dato, Long id);
	
	public void delete(Long id);
	
	public List<Seguidor> findSeguidos(Long id); 
	
	public List<Seguidor> findSeguidores(Long id);
	
	public Seguidor addSeguidor(Long id, Long id2);
	
	public void deleteSeguidor(Long id, Long id2);

}
