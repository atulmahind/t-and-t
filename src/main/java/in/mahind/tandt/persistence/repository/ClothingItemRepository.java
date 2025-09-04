package in.mahind.tandt.persistence.repository;

import in.mahind.tandt.persistence.entity.ClothingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClothingItemRepository extends JpaRepository<ClothingItem, String> {

  Optional<ClothingItem> findByItemId(String itemId);
  ClothingItem save(ClothingItem clothingItem);
}
