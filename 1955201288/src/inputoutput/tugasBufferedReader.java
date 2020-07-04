/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author WINDOWS 10
 */
public class tugasBufferedReader {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
     
        String nama ;
        String alamat ;
        int tinggi ;
        double gaji;
        String kerja ;
        
        //object inputStream
        InputStreamReader isr = new InputStreamReader(System.in);
        // object bufferedReader
        BufferedReader br = new BufferedReader(isr);
        
        // mengisi variabel nama dengan bufferedReader
        System.out.println("Siapa nama anda ?");
        nama = br.readLine();
        
        System.out.println("Dimana alamat anda ?");
        alamat = br.readLine();
        
        System.out.println("Berapa tinggi badan anda ?");
        tinggi = Integer.parseInt(br.readLine());
        
        System.out.println("Berapa gajian anda perbulan ?");
        gaji = Double.parseDouble(br.readLine());
        
        System.out.println("Dimana anda bekerja ?");
        kerja = br.readLine();
        
        // menampilkan nama
        System.out.println("Nama anda adalah " + nama);
        System.out.println("Alamat anda di " + alamat);
        System.out.println("Tinggi badan anda " + tinggi);
        System.out.println("Berat badan mu " + gaji);
        System.out.println("Anda bekerja di " + kerja);
        
        

                
    }
    
}