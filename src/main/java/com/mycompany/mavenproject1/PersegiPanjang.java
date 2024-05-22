/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author nurrohman
 */
public class PersegiPanjang {

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    private int panjang;
    private int lebar;
    
    public int hitungLuas(){
        return (this.panjang * this.lebar);
    }
    
    public int hitungKeliling(){
        return (this.panjang+this.lebar)*2;
    }
    
    public void printHasil(){
        System.out.println("Luas: " + this.hitungLuas());
        System.out.println("Keliling: " + this.hitungKeliling());
    }
}
