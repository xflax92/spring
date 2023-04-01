package org.example.service.inventory.products;

import org.example.model.inventory.request.InventoryRequest;
import org.example.model.inventory.response.Factor;
import org.example.model.inventory.response.partes.HeaderCtrl;
import org.example.model.inventory.response.partes.RfBody;
import org.example.model.inventory.response.partes.RfInfo;
import org.example.service.inventory.FactorService;
import org.example.util.Const;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CspCrvFactorService extends FactorService {

    private String assetClassService = Const.CSP;
    private String factorTypeService = Const.CRV;

    public List<Factor> getInventory(InventoryRequest req){
        List<Factor> res = new ArrayList<>();
        if(req.getEngine().equals("SCM")){
            res = getInventorySCM(req);
        } else if ("OPE".equalsIgnoreCase(req.getEngine())) {
            res = getInventoryOPE(req);
        } else {
            //TODO by default
        }
        return res;
    };

    public List<Factor> getInventorySCM(InventoryRequest req){
        RfInfo rfInfo = new RfInfo("CSP", "CRV", "SCM");
        Factor factor = new Factor(new HeaderCtrl(), rfInfo, new RfBody());
        return Arrays.asList(factor);
    }

    public List<Factor> getInventoryOPE(InventoryRequest req){
        RfInfo rfInfo = new RfInfo("CSP", "CRV", "OPE");
        Factor factor = new Factor(new HeaderCtrl(), rfInfo, new RfBody());
        return Arrays.asList(factor);
    }

    @Override
    public String getAssetClassService() {
        return assetClassService;
    }

    @Override
    public String getFactorTypeService() {
        return factorTypeService;
    }

    ;
}
