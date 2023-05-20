package co.com.alccard.model.user.gateways;

import co.com.alccard.model.user.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    User findById(Integer id);
    List<User> getAll();
    void update(User user);
    void delete(Integer id);
}
