package arquisoft.usuario_ms.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arquisoft.usuario_ms.models.entity.Dato;
import arquisoft.usuario_ms.models.entity.Seguidor;
import arquisoft.usuario_ms.models.service.IDatoService;

@RestController
@RequestMapping("/usuario")
public class DatoRestController {
	
	@Autowired
	private IDatoService datoService;
	
	@GetMapping("/dato")
	public List<Dato> all(){
		return datoService.findAll();
	}
	
	@GetMapping("/dato/{id}")
	public Dato findById(@PathVariable Long id) {
		return datoService.findById(id);
	}
	
	@PostMapping("/dato")
	public Dato create(@RequestBody Dato dato) {
		return datoService.create(dato);
	}
	
	@PutMapping("/dato/{id}")
	public Dato changeUsername(@PathVariable Long id, @RequestBody Dato dato) {
		return datoService.update(dato, id);
	}	
	
	@GetMapping("/seguidores/{id}")
	public List<Seguidor> findSeguidores(@PathVariable Long id) {
		return datoService.findSeguidores(id);
	}
	
	@GetMapping("/seguidos/{id}")
	public List<Seguidor> findSeguidos(@PathVariable Long id) {
		return datoService.findSeguidos(id);
	}
	
	@PostMapping("/seguidor/{id}/{id2}")
	public Seguidor addSeguidor(@PathVariable Long id, @PathVariable Long id2) {
		return datoService.addSeguidor(id, id2);
	}

}
