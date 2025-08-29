package in.mahind.tandt.controller;

import in.mahind.tandt.api.UserApi;
import in.mahind.tandt.model.GetClothingItem401Response;
import in.mahind.tandt.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController implements UserApi {
    @Override
    @PostMapping(
            value = "/user",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<GetClothingItem401Response> createUser(User user) {
        return UserApi.super.createUser(user);
    }

    @Override
    @DeleteMapping(
            value = "/user/{userId}",
            produces = { "application/json" }
    )
    public ResponseEntity<Void> deleteUserById(@PathVariable("userId") String userId) {
        return UserApi.super.deleteUserById(userId);
    }

    @Override
    @GetMapping(
            value = "/user/{userId}",
            produces = { "application/json" }
    )
    public ResponseEntity<User> getUserById(@PathVariable("userId") String userId) {
        return UserApi.super.getUserById(userId);
    }

    @Override
    @PutMapping(
            value = "/user/{userId}",
            produces = { "application/json" },
            consumes = { "application/json" }
    )

    public ResponseEntity<User> updateUserById(@PathVariable("userId") String userId, User user) {
        return UserApi.super.updateUserById(userId, user);
    }
}

