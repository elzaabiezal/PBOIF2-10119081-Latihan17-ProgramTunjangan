/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama  : Muhammad Elza Abiezal
 * Kelas : IF-2
 * NIM   : 10119081
 * Deskripsi program : Program Tunjangan
 */
public class PBOIF210119081Latihan17ProgramTunjangan {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String status;
        int gaji, tunjangan;
        
        System.out.println("Program Tunjangan");
        System.out.println("=================");
        System.out.print("Berapa gaji pokok anda sebulan? : Rp. ");
        gaji = input.nextInt();
        System.out.print("Status Anda? (Menikah/belum) : ");
        status=input.next();
        if ("Menikah".equals(status)) {
            tunjangan = (int) (0.35*gaji);
        } else {
            tunjangan = 0;
        }
        int gajiTotal = gaji+tunjangan;
        System.out.println("");
        System.out.println("==========Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji Pokok              : " + gaji);
        System.out.println("Tunjangan             : " + tunjangan);
        System.out.println("Gaji Total            : " + gajiTotal);
        System.out.println("Developed by : Muhammad Elza Abiezal ");
        
    }
    
}
