/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B;

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

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama barang: ");
        String namaBarang = input.nextLine();

        System.out.println("Masukkan harga barang: ");
        double hargaBarang = input.nextDouble();

        System.out.println("Masukkan jumlah beli: ");
        int jumlahBeli = input.nextInt();

        double totalSebelumDiskon = hargaBarang * jumlahBeli;
        double diskon = 0;

        if (totalSebelumDiskon >= 100000) {
            diskon = 0.10 * totalSebelumDiskon;
        }

        double totalBayar = totalSebelumDiskon - diskon;

        System.out.println("Total sebelum diskon: " + (long) totalSebelumDiskon);
        System.out.println("Diskon: " + (long) diskon);
        System.out.println("\nTotal bayar: " + (long) totalBayar);
        input.close();
    }
}