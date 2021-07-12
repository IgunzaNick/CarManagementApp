package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import model.User;
import repositories.Userrepository;

@Service

public class UserService {
	@Autowired private BCryptPasswordEncoder encoder;
	@Autowired private Userrepository userrepository;

	public void save(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		userrepository.save(user);
		
		
	}

}
