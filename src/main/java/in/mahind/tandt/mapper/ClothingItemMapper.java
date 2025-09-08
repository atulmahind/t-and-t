package in.mahind.tandt.mapper;

import in.mahind.tandt.model.ClothingItem;
import in.mahind.tandt.persistence.entity.ClothingItemEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClothingItemMapper {

    ClothingItemEntity map(ClothingItem clothingItem);

    ClothingItem map(ClothingItemEntity entity);
}
