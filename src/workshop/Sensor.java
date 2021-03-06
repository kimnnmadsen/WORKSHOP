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
abstract class Sensor extends ADevice{

    public Sensor(String name) {
        super(name);
    }

    public Sensor(UUID uuid, String name) {
        super(uuid, name);
    }
   
    public Sensor() {
    }

    public Sensor(UUID uuid) {
        super(uuid);
    }
    
    public abstract int getValue();
    
    
}
