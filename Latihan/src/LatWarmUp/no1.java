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
public class no1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i>5) {
                System.out.print(i);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("0");
            }
            if (i<6) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
