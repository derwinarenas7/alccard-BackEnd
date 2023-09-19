package co.com.alccard.jpa.adapter;

import co.com.alccard.jpa.entity.UserEntity;
import co.com.alccard.jpa.repository.UserRepository;
import co.com.alccard.model.user.User;
import co.com.alccard.model.user.gateway.UserRepositoryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserEntityJPAImpl implements UserRepositoryGateway {

    private UserRepository userRepository;

    @Autowired
    UserEntityJPAImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * @param user
     * @return
     */
    @Override
    public User save(User user) {

        try {
            UserEntity userEntity = UserEntity.builder()
                    .id(user.getId())
                    .name(user.getName())
                    .surname(user.getSurname())
                    .email(user.getEmail())
                    .telephone(user.getTelephone())
                    .address(user.getAddress())
                    .build();

            userRepository.save(userEntity.getId(),
                    userEntity.getName(),
                    userEntity.getSurname(),
                    userEntity.getEmail(),
                    userEntity.getTelephone(),
                    userEntity.getAddress());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public User findById(Long id) {
        return User.builder()
                .id(id)
                .build();
    }

    /**
     * @return
     */
    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void update(User user) {

    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {

    }
}
