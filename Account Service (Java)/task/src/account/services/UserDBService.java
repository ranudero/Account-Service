package account.services;

import account.domain.User;
import account.dtos.CreatedUserDTO;
import account.dtos.SignupNewUserCommand;
import org.springframework.stereotype.Service;

@Service
public class UserDBService implements UserService {


    @Override
    public CreatedUserDTO createNewUser(SignupNewUserCommand newUser) {
        User user = newUser.toUser();
        System.out.println(user.toString());
        return CreatedUserDTO.from(user);
    }
}
