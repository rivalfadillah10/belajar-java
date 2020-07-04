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
import java.util.Scanner;

public class percabanganIfElse {

    public static void main(String[] args) {

        // membuat variabel dan Scanner
        int umur;
        String nama;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("umur: ");
        umur = scan.nextInt();

        // cek apakah dia lulus atau tidak
        if( umur >= 18 ) {
            System.out.println("Selamat " + nama + ", anda dewasa!");
        } else {
            System.out.println("Maaf " + nama + ", anda masih anak kecil");
        }

    }

}

    
    

