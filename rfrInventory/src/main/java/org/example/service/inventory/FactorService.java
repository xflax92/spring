package org.example.service.inventory;

import org.example.model.inventory.request.InventoryRequest;

/**
 * Here you are going to specify common implementations for every Factor.
 * If mehotd is not here you mandatory have to implement in your xxxFactorService what implements FactorService
 */
public abstract class FactorService implements FactorServiceInterface{

    @Override
    public Boolean canProcessGetInventory(InventoryRequest req) {
        return getAssetClassService().equals(req.getAssetClass()) && getFactorTypeService().equals(req.getFactorType());
    }

    @Override
    public String buildHeader() {
        return null;
    }

    @Override
    public String buildRfInfo() {
        return null;
    }

    @Override
    public String buildRfBody() {
        return null;
    }
}
