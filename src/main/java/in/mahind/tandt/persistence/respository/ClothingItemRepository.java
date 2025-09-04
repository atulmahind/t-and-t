package in.mahind.tandt.persistence.respository;

import in.mahind.tandt.persistence.entity.ClothingItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClothingItemRepository extends JpaRepository<ClothingItemEntity, String> {

    Optional<ClothingItemEntity> findByItemId(String itemId);

    ClothingItemEntity save(ClothingItemEntity clothingItem);
}
