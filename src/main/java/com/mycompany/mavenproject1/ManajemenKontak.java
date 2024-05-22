/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nurrohman
 */
public class ManajemenKontak {
    private List<Kontak> daftarKontak;

    public ManajemenKontak() {
        this.daftarKontak = new ArrayList<>();
    }

    public List<Kontak> getKontak(){
        return this.daftarKontak;
    }

    public void addKontak(Kontak kontak) {
        daftarKontak.add(kontak);
        System.out.println("Kontak berhasil ditambahkan.");
    }

    public Kontak searchKontak(String nama) {
        for (Kontak kontak : daftarKontak) {
            if (kontak.getNama().equalsIgnoreCase(nama)) {
                return kontak;
            }
        }
        return null;
    }

    public void deleteKontak(String nama) {
        Kontak kontak = searchKontak(nama);
        if (kontak != null) {
            daftarKontak.remove(kontak);
            System.out.println("Kontak berhasil dihapus.");
        } else {
            System.out.println("Kontak tidak ditemukan.");
        }
    }

    public void displayKontak() {
        if (daftarKontak.isEmpty()) {
            System.out.println("Daftar kontak kosong.");
        } else {
            for (Kontak kontak : daftarKontak) {
                System.out.println("Nama: " + kontak.getNama() + "  Nomor Telephon: " + kontak.getNomorTelepon());
            }
        }
    }
}
