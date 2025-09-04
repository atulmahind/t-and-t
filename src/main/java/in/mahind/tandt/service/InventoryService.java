package in.mahind.tandt.service;

import in.mahind.tandt.model.ClothingItem;
import in.mahind.tandt.persistence.entity.ClothingItemEntity;
import in.mahind.tandt.persistence.respository.ClothingItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InventoryService {

    private final ClothingItemRepository clothingItemRepository;

    public ClothingItem addClothingItem(ClothingItem item) {
        ClothingItemEntity clothingItemEntity = new ClothingItemEntity()
                .name(item.getName())
                .description(item.getDescription())
                .size(item.getSize())
                .color(item.getColor())
                .category(item.getCategory())
                .isNew(item.getIsNew())
                .laundryState(item.getLaundryState());

        ClothingItemEntity savedItem = clothingItemRepository.save(clothingItemEntity);

    }

    public ClothingItem getClothingItemById(String id) {

    }

}
