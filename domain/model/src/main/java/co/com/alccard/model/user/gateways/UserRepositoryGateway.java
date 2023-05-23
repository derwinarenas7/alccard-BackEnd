package co.com.alccard.model.user.gateways;

import co.com.alccard.model.user.User;

import java.util.List;

public interface UserRepositoryGateway {
    User save(User user);
    User findById(Long id);
    List<User> getAll();
    void update(User user);
    void delete(Long id);
}
