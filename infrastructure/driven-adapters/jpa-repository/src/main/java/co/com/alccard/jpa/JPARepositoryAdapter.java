/*
package co.com.alccard.jpa;

import co.com.alccard.jpa.entity.UserEntity;
import co.com.alccard.jpa.helper.AdapterOperations;
import co.com.alccard.model.user.User;
import co.com.alccard.model.user.gateways.UserRepositoryGateway;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class JPARepositoryAdapter extends AdapterOperations<User, UserEntity, Long, JPARepository> implements UserRepositoryGateway {

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.mapBuilder(d,User.UserBuilder.class).build());
    }

    @Override
    public User save(User user) {
        var userData = toData(user);
        return toEntity(saveData(userData));
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Long id) {

    }
}
*/
