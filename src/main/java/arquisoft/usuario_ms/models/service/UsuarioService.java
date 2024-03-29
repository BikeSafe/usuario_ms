package arquisoft.usuario_ms.models.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import arquisoft.usuario_ms.models.entity.Usuario;
import arquisoft.usuario_ms.models.repository.IUsuarioDao;

@Service
public class UsuarioService implements UserDetailsService {
	
	private Logger logger =  LoggerFactory.getLogger(UsuarioService.class);
	
	@Autowired
	private IUsuarioDao usuarioDao;
	

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioDao.findByUsername(username);
		
		List<String> roles = new ArrayList<String>();
	        
		roles.add("ROLE_ADMIN");
		roles.add("ROLE_USER");
		
		if(usuario==null) {
			logger.error("Error Login: no existe el usuario "+username);
	  		throw new UsernameNotFoundException("Error Login: no existe el usuario "+username);
		}
		
		List<GrantedAuthority> authorities = roles
	                .stream()
	                .map(role -> new SimpleGrantedAuthority(role))
	                .collect(Collectors.toList());
		
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.isEnabled(), true, true, true, authorities);
	}	

}
