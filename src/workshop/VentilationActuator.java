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
public class VentilationActuator extends Actuator {

    public VentilationActuator(String name) {
        super(name);
    }

    public VentilationActuator(UUID uuid, String name) {
        super(uuid, name);
    }

    public VentilationActuator() {
    }

    public VentilationActuator(UUID uuid) {
        super(uuid);
    }

    @Override
    public void setValue(int value) {
        if (value >= 0 && value <= 100) {
            super.setValue(value);
        }
    }
}
