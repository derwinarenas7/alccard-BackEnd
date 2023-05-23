package co.com.alccard.jpa.adapter;

import co.com.alccard.jpa.entity.UserEntity;
import co.com.alccard.jpa.helper.UserMapper;
import co.com.alccard.jpa.repository.UserEntityJpaRepository;
import co.com.alccard.model.user.User;
import co.com.alccard.model.user.gateways.UserRepositoryGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserEntityRepositoryImpl implements UserRepositoryGateway {

    private final UserMapper userMapper;
    private final UserEntityJpaRepository userEntityJpaRepository;

    /**
     * @param user
     * @return
     */
    @Override
    public User save(User user) {
        UserEntity userData = userMapper.toEntity(user);
        return userMapper.toUser(userEntityJpaRepository.save(userData));
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
