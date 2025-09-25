package in.mahind.tandt.service;

import in.mahind.tandt.mapper.CreateUserMapper;
import in.mahind.tandt.model.CreateUserRequest;
import in.mahind.tandt.persistence.entity.UserEntity;
import in.mahind.tandt.persistence.respository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  private final CreateUserMapper createUserMapper;
  private final UserRepository userRepository;

  public UserService(CreateUserMapper createUserMapper, UserRepository userRespository) {
    this.createUserMapper = createUserMapper;
    this.userRepository = userRespository;
  }

  public void createUser(CreateUserRequest user) {
    UserEntity userEntity = createUserMapper.map(user);
    userRepository.save(userEntity);
  }
}
