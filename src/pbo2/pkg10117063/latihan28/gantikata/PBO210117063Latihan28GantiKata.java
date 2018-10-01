/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author DEADPOOL
 */
public class PBO210117063Latihan28GantiKata {

    /*  Nama : Cessario Sheva Lakita Purwa Adidjaya
        NIM  : 10117063
        Kelas : IF-2
        Deskripsi Program : Mengganti kata
     */
    public static void main(String[] args) {
        String kalimat,kalimat1,kalimat2;
        
        System.out.println("====Program Mengganti====");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan Kalimat : ");
        kalimat = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        kalimat1 = scanner.nextLine();
        System.out.print("Menjadi Kata : ");
        kalimat2 = scanner.nextLine();
        
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat Awal : " + kalimat);
        System.out.println("Kalimat Awal : " + kalimat.replace(kalimat1,kalimat2));
    }
    
}
