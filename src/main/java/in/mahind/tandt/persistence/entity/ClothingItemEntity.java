package in.mahind.tandt.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ClothingItemEntity {
    private String userId;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String itemId;
    private String name;
    private String description;
    private String size;
    private String color;
    private String category;
    private Boolean isNew;
    private String laundryState;

}
