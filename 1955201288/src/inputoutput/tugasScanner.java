/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class tugasScanner {
    public static void main(String[] args) {
        
     
        String nama = "";
        String alamat = "";
        int tinggi = 0;
        double nilai;
        String pondok = "";
        
        //object Scanner
        Scanner br = new Scanner(System.in);
                
        // mengisi variabel nama dengan bufferedReader
        System.out.println("Siapa Nama Anda ?");
        nama = br.nextLine();
        
        System.out.println("Dimana Alamat anda ?");
        alamat = br.nextLine();
        
        System.out.println("berapa tinggi badan anda ?");
        tinggi = Integer.parseInt(br.nextLine());
        
        System.out.println("Berapa nilai ujian diniah anda  ?");
        nilai = Double.parseDouble(br.nextLine());
        
        System.out.println("Dimana pondok anda ?");
        pondok = br.nextLine();
        
        // menampilkan nama
        System.out.println("Nama anda adalah" + " " + nama);
        System.out.println("Alamat anda di" + " " + alamat);
        System.out.println("Tinggi badan anda" + " " + tinggi);
        System.out.println("Nilai ujian diniah anda " + " " + nilai);
        System.out.println("pondok anda di" + " " + pondok);
        
        

    }
    
}
