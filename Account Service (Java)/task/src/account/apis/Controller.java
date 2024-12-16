package account.apis;

import account.dtos.CreatedUserDTO;
import account.dtos.SignupNewUserCommand;

import account.services.UserService;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import account.services.UserDBService;

@RestController
@Validated
@RequestMapping("api/auth")
public class Controller {

    private final UserService userService;

    public Controller(UserDBService userService) {
        this.userService = userService;
    }

    @PostMapping("signup")
    public CreatedUserDTO addUser(@RequestBody @Valid SignupNewUserCommand newUser) {
        return userService.createNewUser(newUser);
    }
}
