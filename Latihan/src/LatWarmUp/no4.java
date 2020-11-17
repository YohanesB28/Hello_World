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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class no4 {

    public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int[][] arr=new int[a][a];
//         for (int i = 0; i < a; i++) {
//             for (int j = 0; j < a; j++) {
//                 arr[i][j]=sc.nextInt();
//             }
//        }
//         int b=diagonalDiff(arr);
//         System.out.print(b);
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;
//        miniMaxSum(arr);
//        convert("12:40:22AM");
        double a=4.7;
        double s=Math.pow(3, 4);
        System.out.println((int)s);
        long x=Long.MIN_VALUE;
        int y=Integer.MIN_VALUE;
        String c=Integer.toString(y);
        c=Double.toString(s);
        System.out.println();
    }

    public static String convert(String s) {
        String sample = s.substring(s.length() - 2, s.length() - 1);
        if (sample.equalsIgnoreCase("a")) {
            if (s.substring(0, 2).equalsIgnoreCase("12")) {
                sample = "00" + s.substring(2, s.length() - 2);
            } else {
                sample = s.substring(0, s.length() - 2);
            }
        } else {
            int count = Integer.parseInt(s.substring(0, 2));
            if (count != 12) {
                count = count + 12;
            }
            sample = count + s.substring(2, s.length() - 2);
        }
        System.out.println(sample);
        return sample;
    }

    public static int diagonalDiff(int[][] ray) {
        int a = 0, b = 0, c = ray.length - 1;
        for (int i = 0; i < ray.length; i++) {
            a = a + ray[i][i];
            b = b + ray[i][c];
            c--;
        }
        return Math.abs(a - b);
    }

    public static void coba(int n) {
        int a = n - 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= a) {
                    System.out.print(" ");
                } else if (j > a) {
                    System.out.print("#");
                }
            }
            a--;
            System.out.println();
        }
    }

    static void miniMaxSum(int[] arr) {
        long min = 0, max = 0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    sum = sum + arr[j];
                }
            }
            if (i == 0) {
                max = sum;
                min = sum;
            } else if (max < sum) {
                max = sum;
            } else if (min > sum) {
                min = sum;
            }
            sum = 0;
        }
        System.out.print(min + " " + max);
    }
}
