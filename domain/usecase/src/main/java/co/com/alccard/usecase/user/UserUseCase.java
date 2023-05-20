package co.com.alccard.usecase.user;

import co.com.alccard.model.user.User;
import co.com.alccard.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
public class UserUseCase {

    private UserRepository userRepository;

    /**
     * Method to save a user into the DataBase
     *
     * @param user
     * @return
     */
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    /**
     * @param id
     * @return
     */
    public User getUserById(Integer id) {
        return userRepository.findById(id);
    }

    /**
     * @return
     */
    public List<User> getUsers() {
        return new ArrayList<>();
    }

    /**
     * @param user
     */
    public void updateUser(User user) {
        userRepository.update(user);
    }

    /**
     * @param id
     */
    public void deleteUser(Integer id) {
        userRepository.delete(id);
    }
}
