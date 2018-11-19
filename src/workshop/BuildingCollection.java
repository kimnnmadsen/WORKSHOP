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
    
    public ArrayList<Building> getBuildings(){
        return buildings;
    }
}
