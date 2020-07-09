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
public class no3 {
    public static void main(String[] args) {
        int x=19;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (i==j) {
                    System.out.print("*");
                }else if (j==x) {
                    System.out.print("x");
                }  else{
                    System.out.print("0");
                }
            }
            System.out.print("\n");
            x--;
        }
    }
}
