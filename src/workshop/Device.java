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
public abstract class Device {

    private UUID uuid;
    private UUID buildingUUID;
    private double value;
    private String type;

    public Device(UUID buildingUUID) {
        this.buildingUUID = buildingUUID;
        value = Math.random();
    }

    public Device(UUID buildingUUID, double value) {
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

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UUID: ").append(getUUID())
                .append("\tValue: ").append(getValue())
                .append("\n");
        return sb.toString();
    }

    public void setValue(int value) {
        this.value = value;
    }

}
