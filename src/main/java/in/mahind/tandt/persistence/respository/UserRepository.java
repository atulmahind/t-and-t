package in.mahind.tandt.persistence.respository;

import in.mahind.tandt.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

  UserEntity save(UserEntity user);
}
