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
public abstract class ADevice {

    private UUID uuid;
    private UUID buildingUUID;
    double value;

    public ADevice(UUID buildingUUID) {
        uuid = UUID.randomUUID();
        this.buildingUUID = buildingUUID;
        value = Math.random();
    }

    public ADevice(UUID buildingUUID, double value) {
        this.buildingUUID = buildingUUID;
        this.value = value;
    }

    public UUID getUUID() {
        return uuid;
    }

    public UUID getBuildingUUID() {
        return buildingUUID;
    }

    public double getValue() {
        return value;
    }

    public void setBuildingUUID(UUID buildingUUID) {
        this.buildingUUID = buildingUUID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UUID: ").append(getUUID())
                .append("\tValue: ").append(getValue())
                .append("\n");
        return sb.toString();
    }

}
