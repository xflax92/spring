package org.example.service.inventory;

import org.example.model.inventory.request.InventoryRequest;
import org.example.model.inventory.response.Factor;

import java.util.List;

public interface FactorServiceInterface {

    Boolean canProcessGetInventory(InventoryRequest inventoryRequest);
    List<Factor> getInventory(InventoryRequest req);
    String getAssetClassService();
    String getFactorTypeService();
    String buildHeader();
    String buildRfInfo();
    String buildRfBody();

}
