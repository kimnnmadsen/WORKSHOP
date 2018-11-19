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
class Actuator extends Device{

    public Actuator(UUID buildingUUID) {
        super(buildingUUID, "Actuator");
    }
    
    public Actuator(UUID buildingUUID, double value) {
        super(buildingUUID, "Actuator", value);
    }
    
    
}
