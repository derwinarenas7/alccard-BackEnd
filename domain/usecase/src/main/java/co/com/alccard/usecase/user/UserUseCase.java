package co.com.alccard.usecase.user;

import co.com.alccard.model.user.User;
import co.com.alccard.model.user.gateways.UserRepositoryGateway;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
public class UserUseCase {

    private final UserRepositoryGateway userRepositoryGateway;

    /**
     * Method to save a user into the DataBase
     *
     * @param user
     * @return
     */
    public User saveUser(User user) {
        return userRepositoryGateway.save(user);
    }

    /**
     * @param id
     * @return
     */
    public User getUserById(Long id) {
        return userRepositoryGateway.findById(id);
    }

    /**
     * @return
     */
    public List<User> getAllUsers() {
        return new ArrayList<>();
    }

    /**
     * @param user
     */
    public void updateUser(User user) {
        userRepositoryGateway.update(user);
    }

    /**
     * @param id
     */
    public void deleteUser(Long id) {
        userRepositoryGateway.delete(id);
    }
}
