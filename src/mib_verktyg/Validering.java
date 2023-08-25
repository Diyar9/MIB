/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mib_verktyg;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Pc
 */
public class Validering {
    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
        boolean resultat = true;
        

        if (rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom!");
            resultat = false;
            rutaAttKolla.requestFocus();
            
        }

        return resultat;
    }

    public static boolean isHeltal(JTextField rutaAttKolla) {
        boolean resultat = true;

        try {
            String inStrand = rutaAttKolla.getText();
            Integer.parseInt(inStrand);
            rutaAttKolla.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Var god ange ett heltal!");
            resultat = false;
        }

        return resultat;
    }

    public static boolean giltigtDatum(JTextField rutaAttKolla) {
        boolean resultat = true;

        if (rutaAttKolla.getText().matches("\\d{4}-\\d{2}-\\d{2}")) {
            rutaAttKolla.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Var god och ange ett giltigt datum!");
            JOptionPane.showMessageDialog(null, "yyyy-mm-dd");
            resultat = false;
        }

        return resultat;
    }

    public static boolean giltigtLosenord(String losenord) {
        if (losenord.length() <= 0) {
            return false;
        }
        if (losenord.length() >= 7) {
            return false;
        } else {
            return true;
        }
    }
}
