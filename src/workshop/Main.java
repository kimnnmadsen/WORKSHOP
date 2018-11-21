/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuildingCollection SDU = new BuildingCollection();
        Building tek = new Building("TEK", "Campusvej 10");
        Building bygg44 = new Building("Byg 44", "Campusvej 4");
        SDU.addBuilding(tek);
        SDU.addBuilding(bygg44);
        

        tek.addActuator();
        tek.addSensor();
        
        
        TextUI.printBuildings(SDU);
        TextUI.printAll(SDU);

    }

}
