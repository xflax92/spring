package org.example.model.inventory.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.inventory.response.partes.HeaderCtrl;
import org.example.model.inventory.response.partes.RfBody;
import org.example.model.inventory.response.partes.RfInfo;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factor {

    private HeaderCtrl headerCtrl;
    private RfInfo rfInfo;
    private RfBody rfBody;

}
