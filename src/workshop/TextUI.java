/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
public class TextUI {

    public static void printBuildings(BuildingCollection bc) {
        System.out.println(bc);
    }

    public static void printAll(BuildingCollection bc) {
        for (Building b : bc.getBuildings()) {
            System.out.println(b);
        }
    }

    private static void bmsPrint(Map<UUID, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<UUID, String> entry : map.entrySet()) {
            sb.append("UUID: ")
                    .append(entry.getKey())
                    .append(" Name :")
                    .append(entry.getValue())
                    .append("\n");
        }

    }

    public static void main(BuildingCollection bc, Building b) {

        IBuildingManagementSystem ISDU = bc;

        System.out.println("\nTEST getSensorInformation & addTemperatureSensor & addCo2Sensor");
        UUID vwtest = ISDU.addCo2Sensor(b.getUUID(), "VW TestCenter");
        ISDU.addTemperatureSensor(b.getUUID(), "Vejr Stationen");
        TextUI.bmsPrint(ISDU.getSensorInformation(b.getUUID()));
        System.out.println("\nTEST removeSensor");
        ISDU.removeSensor(b.getUUID(), vwtest);
        TextUI.bmsPrint(ISDU.getSensorInformation(b.getUUID()));
        System.out.println("\nTEST getActuatorInformation & addVentilationActuator");
        ISDU.addVentilationActuator(b.getUUID(), "Ventilatoren");
        TextUI.bmsPrint(ISDU.getActuatorInformation(b.getUUID()));
        System.out.println("\nTEST removeActuator");
        ISDU.removeSensor(b.getUUID(), vwtest);
        TextUI.bmsPrint(ISDU.getActuatorInformation(b.getUUID()));
        System.out.println("\nTEST getBuildingInformation");
        bmsPrint(ISDU.getBuildingInformation());

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to AWESOME BMS!!!1i!ii!!!");
        while (true) {
            System.out.println("The following commands are supported");
            System.out.println("\tGO <direction>");
            System.out.println("\tBuildings - Get a list of Buildings");
            System.out.println("\tSensors - Get a list of Sensors");
            System.out.println("\tExit - Exits the Application");
            System.out.print(">");
            String token = s.next();
            if (token.equals("Buildings")) {
                TextUI.bmsPrint(ISDU.getBuildingInformation());
            } else if (token.equals("Sensors")) {
                TextUI.bmsPrint(ISDU.getBuildingInformation());
                System.out.println("Please type Building UUID:");
                System.out.print(">");
            }
        }
    }

}
