package org.example.controllers;

import org.example.model.inventory.request.InventoryRequest;
import org.example.model.inventory.response.Factor;
import org.example.service.inventory.FactorServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class InventoryController {

    @Autowired
    private List<FactorServiceInterface> factorServiceInterfaceList;

    @PostMapping("/inventory")
    public List<Factor> getInventory(@RequestBody InventoryRequest inventoryRequest) throws Exception {
        Optional<FactorServiceInterface> optFactorServiceInterface = factorServiceInterfaceList.stream().filter(factorServiceInterface -> factorServiceInterface.canProcessGetInventory(inventoryRequest)).findAny();
        if (optFactorServiceInterface.isPresent()){
            FactorServiceInterface factorServiceInterface = optFactorServiceInterface.get();
            return factorServiceInterface.getInventory(inventoryRequest);
        }else{
            throw new Exception();
        }
    }
}
