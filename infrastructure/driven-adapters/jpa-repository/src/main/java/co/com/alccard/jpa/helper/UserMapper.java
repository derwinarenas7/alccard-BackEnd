package co.com.alccard.jpa.helper;

import co.com.alccard.jpa.entity.UserEntity;
import co.com.alccard.model.user.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toUser(UserEntity userEntity) {
        return User.builder()
                .id(userEntity.getId())
                .name(userEntity.getName())
                .surname(userEntity.getSurname())
                .email(userEntity.getEmail())
                .telephone(userEntity.getTelephone())
                .address(userEntity.getAddress())
                .build();
    }

    public UserEntity toEntity(User user) {
        return UserEntity.builder()
                .id(user.getId())
                .name(user.getName())
                .surname(user.getSurname())
                .email(user.getEmail())
                .telephone(user.getTelephone())
                .address(user.getAddress())
                .build();
    }

}
