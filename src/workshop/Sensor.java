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
class Sensor extends ADevice{
    
    public Sensor(UUID buildingUUID) {
        super(buildingUUID);   
    }

    public Sensor(UUID buildingUUID, double value) {
        super(buildingUUID, value);
    }

}
