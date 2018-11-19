/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

/**
 *
 * @author Kim Madsen <kmads18@student.sdu.dk>
 */
public class TextUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuildingCollection SDU = new BuildingCollection();
        Building tek = new Building("TEK", "Campusvej 10");
        Building bygg44 = new Building("Byg 44","Campusvej 4");
        SDU.addBuilding(tek);
        SDU.addBuilding(bygg44);
        System.out.println(SDU);
        Actuator act1 = new Actuator(tek.getUUID());
        //tek.addActuator();
        //SDU.getBuilding(1).addActuator(new Actuator());
        for (Building b : SDU.getBuildings()){
            System.out.println(b);
        }
                
        //System.out.println("Price: God Pris");
        // TODO code application logic here
    }
    
}
