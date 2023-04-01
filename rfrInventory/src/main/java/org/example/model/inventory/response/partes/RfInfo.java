package org.example.model.inventory.response.partes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RfInfo {

    private String assetClass;
    private String factorType;
    private String engine;
}
