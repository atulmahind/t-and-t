package in.mahind.tandt.service;

import in.mahind.tandt.persistence.entity.ClothingItem;
import in.mahind.tandt.persistence.repository.ClothingItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InventoryService {

  private final ClothingItemRepository repository;

  private void addClothingItem(in.mahind.tandt.model.ClothingItem clothingItem) {

  }

}
