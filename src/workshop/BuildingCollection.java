/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
public class BuildingCollection implements IBuildingManagementSystem {

    private ArrayList<Building> buildings;

    public BuildingCollection() {
        this.buildings = new ArrayList();
    }

    public void addBuilding(Building b) {
        buildings.add(b);
    }

    public void removeBuilding(UUID uuid) {
        for (Building b : buildings) {
            if (b.getUUID().equals(uuid)) {
                buildings.remove(b);
            }
        }
    }

    public void removeBuilding(Building b) {
        buildings.remove(b);
    }

    public ArrayList<Building> getBuildings() {
        return new ArrayList<>(buildings);
    }

    public Building getBuilding(UUID uuid) throws NoBuildingFound {
        for (Building b : buildings) {
            if (b.getUUID() == uuid) {
                return b;
            }
        }
        throw new NoBuildingFound();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bygninger:\n");
        for (Building b : buildings) {
            sb.append("UUID: ").append(b.getUUID())
                    .append("\tName: ").append(b.getName())
                    .append("\tAddress: ").append(b.getAddress())
                    .append("\n");
        }
        return sb.toString();
    }

    @Override
    public Map<UUID, String> getBuildingInformation() {
        Map<UUID, String> map = new HashMap<>();
        for (Building b : buildings) {
            map.put(b.getUUID(), b.getName());
        }
        return map;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        Map<UUID, String> map = new HashMap<>();
        for (Building b : buildings) {
            if (b.getUUID().equals(buildingId)) {
                for (Sensor s : b.getSensors()) {
                    map.put(s.getUUID(), s.getName());
                }

            }
        }
        return map;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        Map<UUID, String> map = new HashMap<>();
        for (Building b : buildings) {
            if (b.getUUID().equals(buildingId)) {
                for (Actuator a : b.getActuactors()) {
                    map.put(a.getUUID(), a.getName());
                }

            }
        }
        return map;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name
    ) {
        TemperatureSensor s = new TemperatureSensor(name);
        for (Building b : buildings) {
            if (b.getUUID().equals(buildingId)) {
                b.addSensor(s);
            }
        }
        return s.getUUID();
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name
    ) {
        Co2Sensor s = new Co2Sensor(name);
        for (Building b : buildings) {
            if (b.getUUID().equals(buildingId)) {
                b.addSensor(s);
            }
        }
        return s.getUUID();
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId
    ) {
        for (Building b : buildings) {
            if (b.getUUID().equals(buildingId)) {
                b.removeSensor(sensorId);
            }
        }
    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name
    ) {
        VentilationActuator a = new VentilationActuator(name);
        for (Building b : buildings) {
            if (b.getUUID().equals(buildingId)) {
                b.addActuator(a);
            }
        }
        return a.getUUID();
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId
    ) {
        for (Building b : buildings) {
            if (b.getUUID().equals(buildingId)) {
                b.removeActuator(actuatorId);
            }
        }
    }
}
    
