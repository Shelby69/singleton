/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronsingleton;

import ico.fes.is.paterns.BaseDeDatosSingleton;

/**
 *
 * @author adagi
 */
public class PatronSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BaseDeDatosSingleton ejemplo;
        ejemplo = new BaseDeDatosSingleton.getIsntance();
        ejemplo.consultarClientes();
    }
    
}
