package account.services;

import account.domain.User;
import account.dtos.CreatedUserDTO;
import account.dtos.SignupNewUserCommand;
import account.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserDBService implements UserService {

    private final UserRepository repository;

    public UserDBService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public CreatedUserDTO createNewUser(SignupNewUserCommand newUser) {
        User user = newUser.toUser();
        repository.save(user);
        return CreatedUserDTO.from(user);
    }
}
