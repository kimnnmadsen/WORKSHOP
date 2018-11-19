/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.ArrayList;

/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
public class BuildingCollection {

    private ArrayList<Building> buildings;

    public BuildingCollection() {
        this.buildings = new ArrayList();
    }

    public void addBuilding(String name, String address) {
        buildings.add(new Building(name, address));
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bygninger:\n");
        for (Building b : buildings) {
            sb.append("Name: ").append(b.getName())
                    .append("\tAddress: ").append(b.getAddress())
                    .append("\tUUID: ").append(b.getUUID())
                    .append("\n");

        }
        return sb.toString();
    }
}
