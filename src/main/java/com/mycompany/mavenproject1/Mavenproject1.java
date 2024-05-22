/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nurrohman
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu Soal:");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Bilangan Prima");
            System.out.println("3. Mengurutan Array");
            System.out.println("4. Manajemen Kontak");
            System.out.println("5. Manajemen Inventaris");
            System.out.println("6. Manajemen Hewan Peliharaan");
            System.out.println("7. Exit");
            System.out.print("Pilih opsi: ");
            String pilihan = scan.nextLine();
            Service service = new Service();
            switch(pilihan){
                case "1" -> service.PilihanMenu1();
                case "2" -> service.PilihanMenu2();
                case "3" -> service.PilihanMenu3();
                case "4" -> service.PilihanMenu4(scan);
                case "5" -> service.PilihanMenu5();
                case "6" -> service.PilihanMenu6();
                case "7" -> System.exit(0);
                default -> System.out.println("Opsi tidak valid");
            }
        }
    }
}
