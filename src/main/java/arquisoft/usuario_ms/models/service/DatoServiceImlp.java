package arquisoft.usuario_ms.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import arquisoft.usuario_ms.models.entity.Dato;
import arquisoft.usuario_ms.models.entity.Seguidor;
import arquisoft.usuario_ms.models.repository.IDatoDao;
import arquisoft.usuario_ms.models.repository.ISeguidorDao;

@Service
public class DatoServiceImlp implements IDatoService{
	
	@Autowired
	private IDatoDao datoDao;
	
	@Autowired
	private ISeguidorDao seguidorDao;

	@Override
	public List<Dato> findAll() {
		return (List<Dato>) datoDao.findAll();
	}

	@Override
	public Dato findById(Long id) {
		return datoDao.findById(id).orElse(null);
	}

	@Override
	public Dato create(Dato dato) {
		return datoDao.save(dato);
	}

	@Override
	public Dato update(Dato dato, Long id) {
		
		Dato datoActual = datoDao.findById(id).orElse(null);
		
		datoActual.setApellido_dato(dato.getApellido_dato());
		datoActual.setCedula_dato(dato.getCedula_dato());
		datoActual.setEmail_dato(dato.getEmail_dato());
		datoActual.setNombre_dato(dato.getNombre_dato());
		datoActual.setNombre_dato(dato.getNombre_dato());
		datoActual.setTelefono_dato(dato.getTelefono_dato());
		
		return datoDao.save(datoActual);
	}

	@Override
	public void delete(Long id) {
		datoDao.deleteById(id);
	}

	@Override
	public List<Seguidor> findSeguidos(Long id) {
		Dato dato = datoDao.findById(id).orElse(null);
		return seguidorDao.findAllBySeguidor(dato);
	}

	@Override
	public List<Seguidor> findSeguidores(Long id) {
		Dato dato = datoDao.findById(id).orElse(null);
		return seguidorDao.findAllBySeguido(dato);
	}

	@Override
	public Seguidor addSeguidor(Long id, Long id2) {
		Seguidor seguidor = new Seguidor();
		
		Dato segui = datoDao.findById(id).orElse(null);
		Dato seguido = datoDao.findById(id2).orElse(null);
		
		seguidor.setSeguidor(segui);
		seguidor.setSeguido(seguido);
		
		return seguidorDao.save(seguidor);
		
	}

	@Override
	public void deleteSeguidor(Long id, Long id2) {
		Dato seguidor = datoDao.findById(id).orElse(null);
		Dato seguido = datoDao.findById(id2).orElse(null);
		
		seguidorDao.deleteSeguidor(seguidor, seguido);		
	}
	

}
