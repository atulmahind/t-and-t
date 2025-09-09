package in.mahind.tandt.service;

import in.mahind.tandt.mapper.ClothingItemMapper;
import in.mahind.tandt.model.ClothingItem;
import in.mahind.tandt.persistence.entity.ClothingItemEntity;
import in.mahind.tandt.persistence.respository.ClothingItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InventoryService {

    private final ClothingItemRepository clothingItemRepository;
    private final ClothingItemMapper clothingItemMapper;

    public ClothingItem addClothingItem(ClothingItem item) {
        ClothingItemEntity clothingItemEntity = clothingItemMapper.map(item);
        ClothingItemEntity savedItem = clothingItemRepository.save(clothingItemEntity);
        System.out.println("Hello World!");
        return clothingItemMapper.map(savedItem);
    }

}
