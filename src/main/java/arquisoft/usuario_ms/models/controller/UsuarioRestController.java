package arquisoft.usuario_ms.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arquisoft.usuario_ms.models.entity.Usuario;
import arquisoft.usuario_ms.models.service.IUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/usuario")
	public List<Usuario> findAll(){
		return usuarioService.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario findById(@PathVariable Long id) {
		return usuarioService.findById(id);
	}
	
	@PostMapping("/usuario")
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioService.create(usuario);
	}
	
	@PutMapping("/user/{id}/{username}")
	public Usuario changeUsername(@PathVariable Long id, @PathVariable String username) {
		return usuarioService.changeUsername(id, username);
	}
	
	@PutMapping("/pass/{id}/{password}")
	public Usuario changePassword(@PathVariable Long id, @PathVariable String password) {
		return usuarioService.changePassword(id, password);
	}
	
	@DeleteMapping("/usuario/{id}")
	public Usuario changeStatus(@PathVariable Long id) {
		return usuarioService.changeStatus(id);
	}

}
