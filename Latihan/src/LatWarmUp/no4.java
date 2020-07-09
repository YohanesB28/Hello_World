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
public class no4 {
    public static void main(String[] args) {
        Scanner sh=new Scanner(System.in);
        double insentifJasa, insentifKomisi, pajakIntensif, totalGaji;
        System.out.print("Masukkan jumlah penjualan sales marketing = Rp.");
        int jumlah =sh.nextInt();
        if (jumlah<3000000) {
            insentifJasa=0.015*jumlah;
            insentifKomisi=0.25*insentifJasa;
        }
    }
}
