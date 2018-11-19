/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
class Building {

    private String name;
    private String address;
    private UUID uuid;
    private ArrayList<Sensor> sensors;
    private ArrayList<Actuator> actuators;

    public Building(String name, String address) {
        this.name = name;
        this.address = address;
        this.uuid = UUID.randomUUID();
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    public void addActuator(Actuator actuator) {
        actuators.add(actuator);
    }

    public void removeSensor(UUID uuid) {
        for (Sensor s : sensors) {
            if (s.getUUID().equals(uuid)) {
                sensors.remove(s);
            }
        }
    }

    public void removeActuator(UUID uuid) {
        for (Actuator a : actuators) {
            if (a.getUUID().equals(uuid)) {
                actuators.remove(a);
            }
        }
    }
    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public ArrayList<Actuator> getActuactors() {
        return actuators;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public UUID getUUID() {
        return uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
