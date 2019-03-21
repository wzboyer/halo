package cc.ryanc.halo.model.params;

import cc.ryanc.halo.model.dto.base.InputConverter;
import cc.ryanc.halo.model.entity.User;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * User param.
 *
 * @author johnniang
 * @date 3/19/19
 */
@Data
public class UserParam implements InputConverter<User> {

    @NotBlank(message = "Username must not be blank")
    @Size(max = 50, message = "Length of username must not be more than {max}")
    private String username;

    @NotBlank(message = "Nickname must not be blank")
    @Size(max = 255, message = "Length of nickname must not be more than {max}")
    private String nickname;

    @Email(message = "The email format is incorrect")
    @NotBlank(message = "Email must not be blank")
    @Size(max = 127, message = "Length of email must not be more than {max}")
    private String email;

    @Size(max = 1023, message = "Length of avatar link must not be more than {max}")
    private String avatar;

    @Size(max = 1023, message = "Length of description must not be more than {max}")
    private String description;
}