package account.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record Email(@NotBlank @Pattern(regexp = EMAIL_REGEXP) String value) {
    public static final String EMAIL_REGEXP = "[a-zA-Z0-9.\\-_]*@acme.com$";
}
