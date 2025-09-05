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
                .itemId(item.getItemId())
                .userId(item.getUserId())
                .name(item.getName())
                .description(item.getDescription())
                .size(item.getSize().getValue())
                .color(item.getColor().getValue())
                .category(item.getCategory().getValue())
                .isNew(item.getIsNew())
                .laundryState(item.getLaundryState().getValue());

        ClothingItemEntity savedItem = clothingItemRepository.save(clothingItemEntity);

        return new ClothingItem()
                .itemId(savedItem.itemId())
                .userId(savedItem.userId())
                .name(savedItem.name())
                .description(savedItem.description())
                .size(in.mahind.tandt.model.Size.fromValue(savedItem.size()))
                .color(in.mahind.tandt.model.Color.fromValue(savedItem.color()))
                .category(in.mahind.tandt.model.Category.fromValue(savedItem.category()))
                .isNew(savedItem.isNew())
                .laundryState(in.mahind.tandt.model.LaundryState.fromValue(savedItem.laundryState()));
    }

//    public ClothingItem getClothingItemById(String id) {
//
//    }

}
