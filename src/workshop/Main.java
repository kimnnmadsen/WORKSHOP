/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
//import static workshop.TextUI.bmsPrint;

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

        //Actuator act1 = new VentilationActuator("Ventilatoren");
        //Sensor sen1 = new TemperatureSensor("Vejr Stationen");
        //Sensor sen2 = new Co2Sensor("VW TestCenter");
        //act1.setValue(35);
        //tek.addActuator(act1);
        //tek.addSensor(sen1);
        //tek.addSensor(sen2);
        TextUI.printBuildings(SDU);
        TextUI.printAll(SDU);
        TextUI.main(SDU, tek);

    }
}
