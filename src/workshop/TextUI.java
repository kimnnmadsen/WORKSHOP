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
        SDU.addBuilding("TEK", "Campusvej 10");
        SDU.addBuilding("Byg 44", "Campusvej 4");
        System.out.println(SDU);
        System.out.println("Price: God Pris");
        // TODO code application logic here
    }
    
}
