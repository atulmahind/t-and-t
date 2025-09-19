package in.mahind.tandt.mapper;

import in.mahind.tandt.model.CreateUserRequest;
import in.mahind.tandt.model.CreateUserResponse;
import in.mahind.tandt.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CreateUserMapper {
  UserEntity map(CreateUserRequest createUserRequest);
  CreateUserResponse map(UserEntity userEntity);
}
