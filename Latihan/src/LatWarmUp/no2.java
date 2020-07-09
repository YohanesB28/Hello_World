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
public class no2 {

    public static void main(String[] args) {
        for (int x = 15; x < 30; x++) {
            for (int i = 15; i >= 0; i--) {
                System.out.print(" ");
                for (int j = 0; j < 10; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
