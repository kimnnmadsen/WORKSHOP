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
public class TemperatureSensor extends Sensor {

    public TemperatureSensor(String name) {
        super(name);
    }

    public TemperatureSensor(UUID uuid, String name) {
        super(uuid, name);
    }

    public TemperatureSensor() {
        super();
    }

    public TemperatureSensor(UUID uuid){
        super(uuid);
    }
    
    @Override
    public int getValue() {
        return (int)(Math.random() * 1000.0) + 200;
    }
}
