/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc
 */
package mib_start;


import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

public class testapplikation {
    private static InfDB idb;
    
    public static void main(String[] args) throws InfException {
        try{
            idb = new InfDB ("mibdb", "3306", "mibdba", "mibkey");
            
        } catch(InfException ex){
            Logger.getLogger(testapplikation.class.getName()).log(Level.SEVERE, null, ex);
                  
        }
    }
}
