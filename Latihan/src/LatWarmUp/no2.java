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
        int f = 0;
        for (int x = 1; x <= 15; x++) {
            for (int i = 15 - x; i >= 0; i--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= x + f; j++) {
                switch (x) {
                    case 4:
                    case 7:
                    case 10:
                    case 13:
                        if ((1 < j && j < 7) || (7 < j && j < 13) || (13 < j && j < 19) || (19 < j && j < 25)) {
                            System.out.print(".");
                        } else {
                            System.out.print("*");
                        }
                        break;
                    case 5:
                    case 8:
                    case 11:
                    case 14:
                        if ((3 < j && j < 7) || (9 < j && j < 13) || (15 < j && j < 19) || (21 < j && j < 25)) {
                            System.out.print(".");
                        } else {
                            System.out.print("*");
                        }
                        break;
                    case 6:
                    case 9:
                    case 12:
                    case 15:
                        if ((5 < j && j < 7) || (11 < j && j < 13) || (17<j && j<19) || (23<j && j<25)) {
                            System.out.print(".");
                        } else {
                            System.out.print("*");
                        }
                        break;
                    default:
                        System.out.print("*");
                        break;
                }
            }
            f++;
            System.out.println();
        }
    }
}
