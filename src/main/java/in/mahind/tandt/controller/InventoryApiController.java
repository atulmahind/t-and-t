package in.mahind.tandt.controller;

import in.mahind.tandt.api.InventoryApi;
import in.mahind.tandt.model.ClothingItemRequest;
import in.mahind.tandt.model.ClothingItemResponse;
import in.mahind.tandt.model.Color;
import in.mahind.tandt.model.InventoryId;
import in.mahind.tandt.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryApiController implements InventoryApi {

    private final InventoryService inventoryService;

    @Autowired
    public InventoryApiController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @Override
    @PostMapping(
            value = "/inventory/user/{userId}/details",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<InventoryId> createClothingItem(@PathVariable("userId") String userId, ClothingItemRequest clothingItem) {
        ClothingItemResponse createdClothingItem = inventoryService.addClothingItem(userId, clothingItem);
        return ResponseEntity.ok(new InventoryId().inventoryId(createdClothingItem.getItemId()));
    }

    @Override
    @DeleteMapping(
            value = "/inventory/{itemId}/details",
            produces = { "application/json" }
    )
    public ResponseEntity<Void> deleteClothingItem(@PathVariable ("itemId") String itemId) {
        return InventoryApi.super.deleteClothingItem(itemId);
    }

    @Override
    @DeleteMapping(
            value = "/inventory/{itemId}/image",
            produces = { "application/json" }
    )
    public ResponseEntity<Void> deleteClothingItemImage(@PathVariable("itemId") String itemId) {
        return InventoryApi.super.deleteClothingItemImage(itemId);
    }

    @Override
    @GetMapping(
            value = "/inventory/{itemId}/image",
            produces = { "image/png", "application/json" }
    )
    public ResponseEntity<Resource> getClothingItemImage(@PathVariable("itemId") String itemId) {
        return InventoryApi.super.getClothingItemImage(itemId);
    }

    @Override
    @GetMapping(
            value = "/inventory/{itemId}/details",
            produces = { "application/json" }
    )
    public ResponseEntity<ClothingItemResponse> getClothingItem(@PathVariable("itemId") String itemId) {
    ClothingItemResponse clothingItem =
        new ClothingItemResponse().itemId(itemId).color(Color.MULTI_COLOR);
        return ResponseEntity.ok(clothingItem);
    }

    @Override
    @PutMapping(
            value = "/inventory/{itemId}/details",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<ClothingItemResponse> updateClothingItem(@PathVariable("itemId") String itemId,ClothingItemRequest clothingItem) {
        return InventoryApi.super.updateClothingItem(itemId, clothingItem);
    }

    @Override
    @PutMapping(
            value = "/inventory/{itemId}/image",
            produces = { "image/png", "application/json" },
            consumes = { "image/png" }
    )
    public ResponseEntity<Resource> updateClothingItemImage(@PathVariable("itemId") String itemId, Resource body) {
        return InventoryApi.super.updateClothingItemImage(itemId, body);
    }

    @Override
    @PostMapping(
            value = "/inventory/{itemId}/image",
            produces = { "image/png", "application/json" },
            consumes = { "image/png" }
    )
    public ResponseEntity<Resource> createClothingItemImage(@PathVariable("itemId") String itemId, Resource body) {
        return InventoryApi.super.createClothingItemImage(itemId, body);
    }
}

