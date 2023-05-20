package co.com.alccard.jpa.adapter;

import co.com.alccard.jpa.repository.UserEntityRepository;
import co.com.alccard.model.user.User;
import co.com.alccard.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserEntityRepository userEntityRepository;

    /**
     * @param user
     * @return
     */
    @Override
    public User save(User user) {
        return User
                .builder()
                .id(user.getId())
                .name(user.getName())
                .surname(user.getSurname())
                .email(user.getEmail())
                .telephone(user.getTelephone())
                .address(user.getAddress())
                .build();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public User findById(Integer id) {
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
    public void delete(Integer id) {

    }
}
