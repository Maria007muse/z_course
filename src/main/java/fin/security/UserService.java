package fin.security;

import fin.dto.UserRegistrationDto;
import fin.models.User;
import jakarta.validation.Valid;
import org.springframework.security.core.userdetails.UserDetailsService;


import java.util.List;

public interface UserService extends UserDetailsService {
   
   User save(@Valid UserRegistrationDto registrationDto);

   List<User> getAll();
}