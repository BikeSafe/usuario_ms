package arquisoft.usuario_ms.models.service;

import java.util.List;

import arquisoft.usuario_ms.models.entity.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario findById(Long id);
	
	public Usuario create(Usuario usuario);
	
	public Usuario changeUsername(Long id, String username);
	
	public Usuario changePassword(Long id, String password);
	
	public Usuario changeStatus(Long id);

}
