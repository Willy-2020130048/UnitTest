/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author nurrohman
 */
public class Item {
    private String nama;
    private String kategori;
    private int jumlah;
    private double harga;

    public Item(String nama, String kategori, int jumlah, double harga) {
        this.nama = nama;
        this.kategori = kategori;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public String toString(){
        return "Nama: "+nama+
               "\n Kategori: "+kategori+
               "\n Jumlah: "+jumlah+
               "\n Harga: "+harga;
    }
}
