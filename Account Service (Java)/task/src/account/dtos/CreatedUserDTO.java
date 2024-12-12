package account.dtos;

import account.domain.User;

public record CreatedUserDTO(String name, String lastname, String email) {

    public static CreatedUserDTO from(User user) {
        return new CreatedUserDTO(user.getName(), user.getLastname(), user.getEmail().value());
    }
}