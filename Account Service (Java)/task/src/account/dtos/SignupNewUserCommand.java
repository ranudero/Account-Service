package account.dtos;

import account.domain.Email;
import account.domain.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record SignupNewUserCommand(
        @NotBlank String name,
        @NotBlank String lastname,
        @NotBlank @Pattern(regexp = Email.EMAIL_REGEXP) String email,
        @NotBlank String password
) {
    public User toUser() {
        return new User(name, lastname, new Email(email), password);
    }
}
