package in.mahind.tandt.service;

import in.mahind.tandt.mapper.ClothingItemMapper;
import in.mahind.tandt.model.ClothingItemRequest;
import in.mahind.tandt.model.ClothingItemResponse;
import in.mahind.tandt.persistence.entity.ClothingItemEntity;
import in.mahind.tandt.persistence.respository.ClothingItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InventoryService {

    private final ClothingItemRepository clothingItemRepository;
    private final ClothingItemMapper clothingItemMapper;

    public ClothingItemResponse addClothingItem(String userId, ClothingItemRequest item) {
        ClothingItemEntity clothingItemEntity = clothingItemMapper.map(userId, item);
        ClothingItemEntity savedItem = clothingItemRepository.save(clothingItemEntity);
        System.out.println("Hello World!");
        return clothingItemMapper.map(savedItem);
    }

}
