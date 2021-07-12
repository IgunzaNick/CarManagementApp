package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



import model.User;
import model.UserPrincipal;
import repositories.Userrepository;
@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired Userrepository userrepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	User user = userrepository.findByusername(username);
	if(user == null) {
		throw new UsernameNotFoundException("User not found");
		
	}
	return new UserPrincipal (user);
		
	}

}
