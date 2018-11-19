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
    private int value;

    public Device(UUID buildingUUID) {
        this.buildingUUID = buildingUUID;
    }

    public Device(UUID buildingUUID, int value) {
        this.buildingUUID = buildingUUID;
        this.value = value;
    }

    public UUID getUuid() {
        return uuid;
    }

    public UUID getBuildingUUID() {
        return buildingUUID;
    }

    public int getValue() {
        return value;
    }

    public void setBuildingUUID(UUID buildingUUID) {
        this.buildingUUID = buildingUUID;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
}
