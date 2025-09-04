package in.mahind.tandt.persistence.entity;

import in.mahind.tandt.model.Category;
import in.mahind.tandt.model.Color;
import in.mahind.tandt.model.LaundryState;
import in.mahind.tandt.model.Size;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Setter
@Accessors(fluent = true)
public class ClothingItemEntity {
    private String userId;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String itemId;
    private String name;
    private String description;
    private Size size;
    private Color color;
    private Category category;
    private Boolean isNew;
    private LaundryState laundryState;

}
