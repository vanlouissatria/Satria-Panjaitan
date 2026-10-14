/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sesi_3;

/**
 *
 * @author Asus TUF
 */

import java.util.Scanner;

public class PengelolaanDaftarBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] daftarBelanja = new String[100]; // Kapasitas maks 100 item
        int jumlahItem = 0;
        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("\n=== Daftar Belanja ===");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan item: ");
                    String itemBaru = input.nextLine();
                    daftarBelanja[jumlahItem] = itemBaru;
                    jumlahItem++;
                    System.out.println(itemBaru + " berhasil ditambahkan!");
                    break;

                case 2:
                    if (jumlahItem == 0) {
                        System.out.println("Daftar belanja masih kosong.");
                        break;
                    }
                    System.out.print("Hapus item pada posisi: ");
                    int pos = input.nextInt();
                    if (pos >= 1 && pos <= jumlahItem) {
                        String itemDihapus = daftarBelanja[pos - 1];
                        for (int i = pos - 1; i < jumlahItem - 1; i++) {
                            daftarBelanja[i] = daftarBelanja[i + 1];
                        }
                        daftarBelanja[jumlahItem - 1] = null;
                        jumlahItem--;
                        System.out.println(itemDihapus + " berhasil dihapus!");
                    } else {
                        System.out.println("Posisi tidak valid!");
                    }
                    break;

                case 3:
                    System.out.println("\nDaftar belanja:");
                    if (jumlahItem == 0) {
                        System.out.println("(Kosong)");
                    } else {
                        for (int i = 0; i < jumlahItem; i++) {
                            System.out.println((i + 1) + ". " + daftarBelanja[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Cari item: ");
                    String cari = input.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i < jumlahItem; i++) {
                        if (daftarBelanja[i].equalsIgnoreCase(cari)) {
                            System.out.println(cari + " ditemukan pada posisi " + (i + 1));
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println(cari + " tidak ditemukan dalam daftar.");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        input.close();
    }
}