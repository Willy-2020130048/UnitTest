/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nurrohman
 */
public class ManajemenInventaris {
    private Map<String, Item> daftarItem;

    public ManajemenInventaris() {
        this.daftarItem = new HashMap<>();
    }

    public void addItem(Item item) {
        daftarItem.put(item.getNama().toLowerCase(), item);
        System.out.println("Item berhasil ditambahkan.");
    }

    public Item searchItem(String nama) {
        return daftarItem.get(nama.toLowerCase());
    }

    public void deleteItem(String nama) {
        Item item = daftarItem.remove(nama.toLowerCase());
        if (item != null) {
            System.out.println("Item berhasil dihapus.");
        } else {
            System.out.println("Item tidak ditemukan.");
        }
    }

    public void saveToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Item item : daftarItem.values()) {
                writer.println(item.getNama() + "," + item.getKategori() + "," + item.getJumlah() + "," + item.getHarga());
            }
            System.out.println("Data inventaris berhasil disimpan ke file.");
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menyimpan ke file: " + e.getMessage());
        }
    }

    public void loadFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String nama = parts[0];
                    String kategori = parts[1];
                    int jumlah = Integer.parseInt(parts[2]);
                    double harga = Double.parseDouble(parts[3]);
                    addItem(new Item(nama, kategori, jumlah, harga));
                }
            }
            System.out.println("Data inventaris berhasil dimuat dari file.");
        } catch (IOException | NumberFormatException e) {
            System.err.println("Terjadi kesalahan saat memuat dari file: " + e.getMessage());
        }
    }

    public void displayItems() {
        if (daftarItem.isEmpty()) {
            System.out.println("Daftar item kosong.");
        } else {
            for (Item item : daftarItem.values()) {
                System.out.println(item);
            }
        }
    }
}
