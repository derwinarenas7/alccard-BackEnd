package co.com.alccard.api.user;

import co.com.alccard.model.user.User;
import co.com.alccard.usecase.user.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserUseCase userUseCase;

    @PostMapping("save-user")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User usuario = userUseCase.saveUser(user);

        if (usuario != null) {
            return new ResponseEntity<>(usuario, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(usuario, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    @GetMapping("get-user-by-id")
    public ResponseEntity<User> findById(@RequestParam("id") int id) {
        User user = userUseCase.getUserById(id);
        if (user.getId() != 0) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(user, HttpStatus.NOT_FOUND);
        }
    }





}
