/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author nurrohman
 */
public class Kucing extends Hewan {
    private String warnaBulu;

    public Kucing(String warnaBulu, String nama, int umur) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }
    
    @Override
    public String suara(){
        return super.suara()+ "Meong";
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Warna Bulu: "+ warnaBulu);
    }
}
