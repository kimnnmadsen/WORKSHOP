/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.UUID;

/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
class Actuator extends ADevice implements IWriteable{

    public Actuator(UUID buildingUUID) {
        super(buildingUUID);
    }
    
    public Actuator(UUID buildingUUID, double value) {
        super(buildingUUID, value);
    }
    
    @Override
    public void setValue(double value){
        this.value = value;
    }
    
}
