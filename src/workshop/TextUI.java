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
public class TextUI {
    public static void getBuildings(BuildingCollection bc) {
        for (Building b : bc.getBuildings()) {
            System.out.println(b);
        }
    }
}
