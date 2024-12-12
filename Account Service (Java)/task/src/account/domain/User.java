package account.domain;

import jakarta.validation.constraints.NotBlank;

public class User {

    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String lastname;

    @NotBlank
    private Email email;

    @NotBlank
    private String password;


    public User(String name, String lastname, Email email, String password) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Email getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "ServiceUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email=" + email +
                ", password='" + password + '\'' +
                '}';
    }
}
