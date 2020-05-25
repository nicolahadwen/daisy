package co.hadwen.web.user.dto;

import co.hadwen.dto.Dto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = false)
@ToString
@Data
public class UserDTO  extends Dto {
    private String email;
    private String password;
}
