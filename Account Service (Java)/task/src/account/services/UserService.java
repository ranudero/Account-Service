package account.services;


import account.dtos.CreatedUserDTO;
import account.dtos.SignupNewUserCommand;


public interface UserService {
    CreatedUserDTO createNewUser(SignupNewUserCommand newUser);
}
