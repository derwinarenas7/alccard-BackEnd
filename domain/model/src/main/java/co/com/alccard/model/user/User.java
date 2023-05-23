package co.com.alccard.model.user;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Data
public class User {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String telephone;
    private String address;
}
