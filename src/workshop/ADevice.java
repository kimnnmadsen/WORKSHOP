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
abstract class ADevice {

    private UUID uuid;
    private String name;

    public String getName() {
        return name;
    }

    public ADevice(String name) {
        uuid = UUID.randomUUID();
        this.name = name;
    }

    public ADevice(UUID uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

    public ADevice() {
        uuid = UUID.randomUUID();
    }

    public ADevice(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUUID() {
        return uuid;
    }

    public abstract int getValue();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UUID: ").append(getUUID())
                .append(" Value: ").append(getValue())
                .append("\n");
        return sb.toString();
    }

}
