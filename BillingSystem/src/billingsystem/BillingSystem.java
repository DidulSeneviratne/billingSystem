/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billingsystem;

import javax.swing.WindowConstants;

/**
 *
 * @author DulsaraDidul
 */
public class BillingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Password myframe = new Password();
        myframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        myframe.setTitle("Password frame");
        myframe.setSize(422,200);
        myframe.setVisible(true);
    }
    
}
