/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class tugasJOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    String tanya = JOptionPane.showInputDialog("siapa nama anda ?");
        JOptionPane.showMessageDialog(null, " nama anda " + tanya);
    
    String alamat = JOptionPane.showInputDialog("dimana alamat anda ?");
        JOptionPane.showMessageDialog(null, "Alamat anda di " + alamat);
    
     String nilai  = JOptionPane.showInputDialog("jumlah nilai ujian diniah anda ?");
        JOptionPane.showMessageDialog(null, "jumlah nilai anda " + nilai);  
        
     String mustahiq = JOptionPane.showInputDialog("siapa nama mustahiq anda ?");
        JOptionPane.showMessageDialog(null, "mustahiq anda adalah " + mustahiq ); 
        
     String nomor = JOptionPane.showInputDialog("nomor yang bisa dihubungi ?");
        JOptionPane.showMessageDialog(null, "nomor anda " + nomor );   
    }
    
}
