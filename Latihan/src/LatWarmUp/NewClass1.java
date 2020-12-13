/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatWarmUp;

import java.util.Scanner;

/**
 *
 * @author Bagus Tri Gularso
 */
public class NewClass1 {

    public static void main(String[] args) {
        Scanner project = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI RUMAH SAKIT SPESIALIS PARU");
        System.out.println("\n");
        System.out.println("SILAHKAN MASUK !!!! ");
        System.out.print("Masukkan jumlah pasien = ");
        int jumlah_pasien = project.nextInt();
        for (int i = 0; i < jumlah_pasien; i++) {
            int[] data;
            data = new int[jumlah_pasien];

            data(data, jumlah_pasien);
            System.out.print("Masukkan nomor rekam medis pasien ke -  " + (i + 1) + " = ");
            data[i] = project.nextInt();
            String nama = null;
            nama(nama, jumlah_pasien);
            System.out.print("Masukkan nama = ");
            nama = project.nextLine();
            nama += project.nextLine();

            String m = null;
            Klinik(m, jumlah_pasien);
            String KlinikBronchitis = "Klinik Bronchitis";
            String KlinikIspa = "Klinik Ispa";
            String KlinikBatuk = "Klinik Batuk";
            String KlinikSesakNafas = "Klinik Sesak Nafas";
            String KlinikPanas = "Klinik Panas";
            String KlinikAsma = "Klinik Asma";
            String KlinikTBC = "Klinik TBC";
            String KlinikPneumonia = "Klinik Pneumonia";
            String KlinikKankerParu_Paru = "Klinik Kanker Paru - Paru";
            System.out.print("SILAHKAN PILIH, DAN KETIKLAH KLINIK YANG ANDA INGINKAN DI BAWAH INI !!!");
            System.out.println(" (CONTOH = Klinik Batuk)");
            System.out.println("1. Klinik Bronchitis");
            System.out.println("2. Klinik Ispa");
            System.out.println("3. Klinik Batuk");
            System.out.println("4. Klinik Sesak Nafas");
            System.out.println("5. Klinik Panas");
            System.out.println("6. Klinik Asma");
            System.out.println("7. Klinik TBC");
            System.out.println("8. Klinik Pneumonia");
            System.out.println("9. Klinik Kanker Paru - Paru");
            System.out.print("Silahkan masukkan klinik yang Anda inginkan = ");
            String Klinik = project.nextLine();

            System.out.println("---------------------------------------------------------------");
            System.out.println("NOMOR REKAM MEDIS pasien ke - " + (i + 1) + " adalah = " + data[i]);
            System.out.println("NAMA PASIEN ke - " + (i + 1) + " adalah = " + nama);
            System.out.println("KLINIK YANG DI INGINKAN = " + Klinik);

            if (Klinik.equalsIgnoreCase(KlinikBronchitis)) {
                System.out.println("Dokter anda adalah dr. Blue ");
                System.out.println("Praktek pukul 15.00 - 16.30");
                Pembayaran(100000, 50000);
            }

            if (Klinik.equalsIgnoreCase(KlinikIspa)) {
                System.out.println("Dokter anda adalah dr. Purple");
                System.out.println("Praktek pukul 14.00 - 15.00");
                Pembayaran(200000, 100000);
            }
            if (Klinik.equalsIgnoreCase(KlinikBatuk)) {
                System.out.println("Dokter anda adalah dr. Green");
                System.out.println("Praktek pukul 11.30 - 13.00");
                Pembayaran(100000, 25000);
            }
            if (Klinik.equalsIgnoreCase(KlinikSesakNafas)) {
                System.out.println("Dokter anda adalah dr. Brown");
                System.out.println("Praktek pukul 10.00 - 12.00");
                Pembayaran(50000, 300000);
            }
            if (Klinik.equalsIgnoreCase(KlinikPanas)) {
                System.out.println("Dokter anda adalah dr. Grey");
                System.out.println("Praktek pukul 11.00 - 12.30");
                Pembayaran(120000, 30000);
            }
            if (Klinik.equalsIgnoreCase(KlinikAsma)) {
                System.out.println("Dokter anda adalah dr. White");
                System.out.println("Praktek pukul 14.30 - 16.00");
                Pembayaran(100000, 200000);
            }
            if (Klinik.equalsIgnoreCase(KlinikTBC)) {
                System.out.println("Dokter anda adalah dr. Yellow");
                System.out.println("Praktek pukul 17.00 -)18.00");
                Pembayaran(200000, 100000);
            }
            if (Klinik.equalsIgnoreCase(KlinikPneumonia)) {
                System.out.println("Dokter anda adalah dr. Orange");
                System.out.println("Praktek pukul 18.00 - 19.30");
                Pembayaran(100000, 400000);
            }
            if (Klinik.equalsIgnoreCase(KlinikKankerParu_Paru)) {
                System.out.println("Dokter anda adalah dr. Pink");
                System.out.println("Praktek pukul 14.00 - 15.00");
                Pembayaran(50000, 700000);
            }
            System.out.println("");
            System.out.println("------------------------------------------------------------");
        }
    }

    static int[] data(int[] m, int jumlah_pasien) {
        Scanner project = new Scanner(System.in);
        int[] data;
        data = new int[jumlah_pasien];
        for (int i = 0; i < jumlah_pasien; i++) {
        }
        return null;

    }

    static String nama(String nama, int jumlah_pasien) {
        Scanner project = new Scanner(System.in);
        for (int i = 0; i < jumlah_pasien; i++) {
        }
        return nama;
    }

    static String Klinik(String Klinik, int jumlah_pasien) {
        Scanner project = new Scanner(System.in);
        for (int i = 0; i < jumlah_pasien; i++) {
        }
        return Klinik;
    }

    static void Pembayaran(int m, int n) {
        System.out.println("BIAYA RUMAH SAKIT ANDA ADALAH = " + m + "+" + n + "=" + (m + n));
    }
}
