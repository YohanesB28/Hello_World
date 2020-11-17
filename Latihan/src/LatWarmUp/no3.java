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
        int count = 10;
        int x = count - 1;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == 0 || i == count - 1) {
                    System.out.print("$ ");
                } else if (i == j || j == x) {
                    System.out.print("$ ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.print("\n");
            x--;
        }
    }
}
