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
public class BuildingCollection{

    private ArrayList<Building> buildings;

    public BuildingCollection() {
        this.buildings = new ArrayList();
    }

    public void addBuilding(Building b) {
        buildings.add(b);
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }
    
    public Building getBuilding(UUID uuid) throws NoBuildingFound{
        for (Building b : buildings){
            if (b.getUUID() == uuid){
                return b; 
            }
        }
        throw new NoBuildingFound();
    }
    public Building getBuilding(int index) throws NoBuildingFound{
        return buildings.get(index);
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
}
