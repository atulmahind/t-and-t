package in.mahind.tandt.mapper;

import in.mahind.tandt.model.ClothingItemRequest;
import in.mahind.tandt.model.ClothingItemResponse;
import in.mahind.tandt.persistence.entity.ClothingItemEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClothingItemMapper {

    ClothingItemEntity map(String userId, ClothingItemRequest clothingItem);

    ClothingItemResponse map(ClothingItemEntity entity);
}
