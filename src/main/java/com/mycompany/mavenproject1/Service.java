/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nurrohman
 */
public class Service {
    
    public void PilihanMenu1(){
        PersegiPanjang persegi = new PersegiPanjang(5,3);
        persegi.printHasil();
    }
    
    public void PilihanMenu2(){
        int angka = 2;
        System.out.println( angka + " adalah bilangan prima: " + isPrime(angka) );
    }
    
    public void PilihanMenu3(){
        int[] array = {2,3,4,1,5,2};
        sortArray(array);
        System.out.println("Array yang terurut: " + Arrays.toString(array));
    }
    
    public void PilihanMenu4(Scanner scanner){
        ManajemenKontak manajemenKontak = new ManajemenKontak();
        boolean looping = true;
        do{
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Cari Kontak");
            System.out.println("3. Hapus Kontak");
            System.out.println("4. Tampilkan Semua Kontak");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            String opsi = scanner.nextLine();
            switch (opsi) {
                case "1" -> {
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Nomor Telepon: ");
                    String nomorTelepon = scanner.nextLine();
                    manajemenKontak.addKontak(new Kontak(nama, nomorTelepon));
                }
                case "2" -> {
                    System.out.print("Masukkan Nama yang Dicari: ");
                    String namaCari = scanner.nextLine();
                    Kontak kontak = manajemenKontak.searchKontak(namaCari);
                    if (kontak != null) {
                        System.out.println("Kontak ditemukan: " + kontak);
                    } else {
                        System.out.println("Kontak tidak ditemukan.");
                    }
                }
                case "3" -> {
                    System.out.print("Masukkan Nama yang Akan Dihapus: ");
                    String namaHapus = scanner.nextLine();
                    manajemenKontak.deleteKontak(namaHapus);
                }
                case "4" -> manajemenKontak.displayKontak();
                case "5" -> {
                    System.out.println("Keluar dari program.");
                    looping = false;
                }
                default -> System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }while(looping);
    }
    
    public void PilihanMenu5(){
        ManajemenInventaris manajemenInventaris = new ManajemenInventaris();
        Scanner scanner = new Scanner(System.in);
        boolean looping = true;
        while (looping) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Item");
            System.out.println("2. Cari Item");
            System.out.println("3. Hapus Item");
            System.out.println("4. Tampilkan Semua Item");
            System.out.println("5. Simpan ke File");
            System.out.println("6. Muat dari File");
            System.out.println("7. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline

            switch (opsi) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Kategori: ");
                    String kategori = scanner.nextLine();
                    System.out.print("Masukkan Jumlah: ");
                    int jumlah = scanner.nextInt();
                    System.out.print("Masukkan Harga: ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine(); // Mengonsumsi newline
                    manajemenInventaris.addItem(new Item(nama, kategori, jumlah, harga));
                    break;
                case 2:
                    System.out.print("Masukkan Nama yang Dicari: ");
                    String namaCari = scanner.nextLine();
                    Item item = manajemenInventaris.searchItem(namaCari);
                    if (item != null) {
                        System.out.println("Item ditemukan: " + item);
                    } else {
                        System.out.println("Item tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan Nama yang Akan Dihapus: ");
                    String namaHapus = scanner.nextLine();
                    manajemenInventaris.deleteItem(namaHapus);
                    break;
                case 4:
                    manajemenInventaris.displayItems();
                    break;
                case 5:
                    System.out.print("Masukkan Nama File untuk Menyimpan: ");
                    String fileNameSave = scanner.nextLine();
                    manajemenInventaris.saveToFile(fileNameSave);
                    break;
                case 6:
                    System.out.print("Masukkan Nama File untuk Memuat: ");
                    String fileNameLoad = scanner.nextLine();
                    manajemenInventaris.loadFromFile(fileNameLoad);
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    looping = false;
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }
    
    public void PilihanMenu6(){
        Anjing anjing = new Anjing("Buddy", "Golden Retriever", 3);
        Kucing kucing = new Kucing("Milo", "Putih", 2);

        System.out.println("Informasi Anjing:");
        anjing.info();
        System.out.println("Suara: " + anjing.suara());

        System.out.println("\nInformasi Kucing:");
        kucing.info();
        System.out.println("Suara: " + kucing.suara());
    }
    
    private void sortArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar elemen
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    private boolean isPrime(int n){
        if( n<=1 ){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
