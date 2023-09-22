package co.com.alccard.api.user;

import co.com.alccard.model.user.User;
import co.com.alccard.usecase.user.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class UserController {

    private final UserUseCase userUseCase;

    @PostMapping(path = "/save-user")
    public ResponseEntity<User> saveUser(@RequestBody User user) {

        User usuario = null;

        if (user.getId() != null) {
            usuario = userUseCase.saveUser(user);
            return new ResponseEntity<>(usuario, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(usuario, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("get-user-by-id")
    public ResponseEntity<User> findById(@RequestParam("id") Long id) {

        User user = userUseCase.getUserById(id);
        if (user.getId() != 0) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(user, HttpStatus.NOT_FOUND);
        }
    }

}
