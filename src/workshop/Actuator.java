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
abstract class Actuator extends ADevice {

    int value;

    public Actuator(String name) {
        super(name);
    }

    public Actuator(UUID uuid, String name) {
        super(uuid, name);
    }

    public Actuator() {
        super();
    }

    public Actuator(UUID uuid) {
        super(uuid);
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
