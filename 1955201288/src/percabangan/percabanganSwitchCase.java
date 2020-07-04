/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class percabanganSwitchCase {
    

    public static void main(String[] args) {

        // membuat variabel dan Scanner
        String lift;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Pilih nama lift: ");
        lift = scan.nextLine();

        switch(lift){
            
            case "lift kesatu":
                System.out.println("lift kesatu, untuk guru");
                break;
            case "lift kedua":
                System.out.println("lift kedua, untuk umum");
                break;
            default:
                System.out.println("maaf, lift tidak ada");
        }
    }
}


