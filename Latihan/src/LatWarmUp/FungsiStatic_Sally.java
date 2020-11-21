/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatWarmUp;

/**
 *
 * @author Lenovo
 */
public class FungsiStatic_Sally {
    // TODO code application logic here
    void makan(String makanan) {
        System.out.println("Hi!");
        System.out.println("Saya sedang makan " + makanan);
    }

    // fungsi static
    static void minum(String minuman) {
        System.out.println("Saya sedang minum " + minuman);
    }

    // fungsi main
    public static void main(String[] args) {

        // pemanggilan fungsi static
        minum("Kopi");
        System.out.println("");
        FungsiStatic_Sally saya = new FungsiStatic_Sally();
        // pemanggilan fungsi non-static
        saya.makan("Nasi Goreng");

    }

}
