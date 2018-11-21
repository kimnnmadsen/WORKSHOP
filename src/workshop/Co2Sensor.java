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
public class Co2Sensor extends Sensor {

    public Co2Sensor(String name) {
        super(name);
    }

    public Co2Sensor(UUID uuid, String name) {
        super(uuid, name);
    }

    public Co2Sensor() {
        super();
    }

    public Co2Sensor(UUID uuid){
        super(uuid);
    }
    
    @Override
    public int getValue() {
        return (int)(Math.random() * 100.0);
    }
}
