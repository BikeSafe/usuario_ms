package arquisoft.usuario_ms.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import arquisoft.usuario_ms.models.entity.Usuario;
import arquisoft.usuario_ms.models.repository.IUsuarioDao;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder; 
	
	@Override
	public List<Usuario> findAll(){
		return (List<Usuario>) usuarioDao.findAll();
	}
	
	@Override
	public Usuario findById(Long id) {
		return usuarioDao.findById(id).orElse(null);
	}
	
	@Override
	public Usuario create(Usuario usuario) {
		String pass = passwordEncoder.encode(usuario.getPassword());
		usuario.setPassword(pass);
		return usuarioDao.save(usuario);
	}
	
	@Override
	public Usuario changeUsername(Long id, String username) {
		Usuario usuario = usuarioDao.findById(id).orElse(null);
		usuario.setUsername(username);
		return usuarioDao.save(usuario);		
	}
	
	@Override
	public Usuario changePassword(Long id, String password) {
		String pass = passwordEncoder.encode(password);
		Usuario usuario = usuarioDao.findById(id).orElse(null);
		usuario.setPassword(pass);
		return usuarioDao.save(usuario);		
	}
	
	@Override
	public Usuario changeStatus(Long id) {
		Usuario usuario = usuarioDao.findById(id).orElse(null);
		usuario.setEnabled(!usuario.isEnabled());
		return usuarioDao.save(usuario);
	}

}
