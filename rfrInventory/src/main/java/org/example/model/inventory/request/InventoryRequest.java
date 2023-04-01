package org.example.model.inventory.request;

import lombok.Data;

@Data
public class InventoryRequest {

    private String operation;
    private String engine;
    private String unit;
    private String assetClass;
    private String factorType;

}
