/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sesi_3;

/**
 *
 * @author Asus TUF
 */

/*
    NIM     : 41425016
    NAMA    : Satria Van Louis Panjaitan
    Motto   : If at first you don't succeed, call it version 1.0.
*/

import java.util.Scanner;

public class KonverterWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Konverter Waktu ===");
        System.out.println("1. Detik ke HH:MM:SS");
        System.out.println("2. HH:MM:SS ke detik");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine(); 

        if (pilihan == 1) {
            System.out.print("Masukkan jumlah detik: ");
            int totalDetik = input.nextInt();

            int jam = totalDetik / 3600;
            int sisaDetik = totalDetik % 3600;
            int menit = sisaDetik / 60;
            int detik = sisaDetik % 60;

            System.out.println("Hasil: " + String.format("%02d:%02d:%02d", jam, menit, detik));

        } else if (pilihan == 2) {
            System.out.print("Masukkan waktu (HH:MM:SS): ");
            String waktuStr = input.nextLine();

            String[] bagian = waktuStr.split(":");
            if (bagian.length == 3) {
                int jam = Integer.parseInt(bagian[0]);
                int menit = Integer.parseInt(bagian[1]);
                int detik = Integer.parseInt(bagian[2]);

                int totalDetik = (jam * 3600) + (menit * 60) + detik;
                System.out.println("Hasil: " + totalDetik + " detik");
            } else {
                System.out.println("Format input salah! Gunakan HH:MM:SS");
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}