package in.mahind.tandt.controller;

import in.mahind.tandt.api.UserApi;
import in.mahind.tandt.model.CreateUserRequest;
import in.mahind.tandt.model.CreateUserResponse;
import in.mahind.tandt.model.SuccessResponse;
import in.mahind.tandt.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController implements UserApi {
    private final UserService userService;

  public UserApiController(UserService userService) {
    this.userService = userService;
  }

  @Override
    @PostMapping(
            value = "/user",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<SuccessResponse> createUser(CreateUserRequest user) {
        
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
    public ResponseEntity<CreateUserResponse> getUserById(@PathVariable("userId") String userId) {
        return UserApi.super.getUserById(userId);
    }

    @Override
    @PutMapping(
            value = "/user/{userId}",
            produces = { "application/json" },
            consumes = { "application/json" }
    )

    public ResponseEntity<CreateUserResponse> updateUserById(@PathVariable("userId") String userId, CreateUserRequest user) {
        return UserApi.super.updateUserById(userId, user);
    }
}

