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
class UUIDMismatch extends Exception {

    public UUIDMismatch() {
        super("UUID mismatch between assigned Building UUID and actual Building UUID");
    }

}
