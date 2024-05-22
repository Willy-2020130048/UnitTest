/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author nurrohman
 */
public class Anjing extends Hewan{
    private String ras;

    public Anjing(String ras, String nama, int umur) {
        super(nama, umur);
        this.ras = ras;
    }

    public String getRas() {
        return ras;
    }
    
    @Override
    public String suara(){
        return super.suara() + "Gok gok";
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Jenis Ras: "+ ras);
    }
}
