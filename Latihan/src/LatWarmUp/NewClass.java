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
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 5, 4, 3, 5, 3};
        String dup = "";
        boolean cek = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dup = dup + " " + arr[i];
                    cek = true;
                }
            }
        }
        if (!cek) {
            System.out.println("Tidak ada duplikasi");
        } else {
            System.out.println("Duplikasi = " + dup);
        }
    }
}
