package co.com.alccard.jpa.adapter;

import co.com.alccard.jpa.entity.UserEntity;
import co.com.alccard.jpa.helper.AdapterOperations;
import co.com.alccard.jpa.repository.UserEntityJpaRepository;
import co.com.alccard.model.user.User;
import co.com.alccard.model.user.gateways.UserRepositoryGateway;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserEntityRepositoryImpl extends AdapterOperations<User, UserEntity, Long, UserEntityJpaRepository> implements UserRepositoryGateway {

    public UserEntityRepositoryImpl(UserEntityJpaRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d, User.UserBuilder.class).build());
    }

    /**
     * @param user
     * @return
     */
    @Override
    public User save(User user) {
        var userData = toData(user);
        return null;
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
