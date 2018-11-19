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

    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public ArrayList<Actuator> getActuactors() {
        return actuators;
    }

    public void printSensors() {

    }

    public void printActuators() {

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
