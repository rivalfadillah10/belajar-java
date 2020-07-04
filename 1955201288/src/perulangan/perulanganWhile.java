/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class perulanganWhile {
    


    public static void main(String[] args) {

        // membuat variabel dan scanner
        boolean running = true;
        int counter = 10;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while( running ) {
            System.out.println("Apa yang ingin anda beli?");
            System.out.print("Jawab [minuman/makanan]> ");

            jawab = scan.nextLine();

            // cek jawabannya, kalau minuman maka berhenti mengulang
            if( jawab.equalsIgnoreCase("minuman") ){
                running = false;
            }

            counter++;
        }
    }
}

