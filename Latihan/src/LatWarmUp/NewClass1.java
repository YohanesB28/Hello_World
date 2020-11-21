/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatWarmUp;

/**
 *
 * @author Bagus Tri Gularso
 */
public class NewClass1 {
    void makan(String makanan){
        System.out.println("Hi!");
        System.out.println("Saya sedang makan "+makanan);
    }
    
    static void minum(String minuman){
        System.out.println("Saya sedang minum "+minuman);
    }
    
    public static void main(String[] args) {
        minum("ThaiTea");
        System.out.println();
        NewClass1 coba=new NewClass1();
        coba.makan("Yakisoba");
    }
}
