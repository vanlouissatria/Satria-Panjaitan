/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sesi_3;

import java.util.Scanner;

/**
 *
 * @author Asus TUF
 */

/*
    NIM     : 41425016
    NAMA    : Satria Van Louis Panjaitan
    Motto   : If at first you don't succeed, call it version 1.0.
*/

public class ValidasiKartuKredit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor kartu: ");
        String nomorKartu = input.nextLine().trim();

        // 1. Menghapus semua tanda hubung (-) untuk mempermudah pemrosesan digit
        String digitSaja = nomorKartu.replace("-", "");

        // 2. Memeriksa apakah input tanpa tanda hubung hanya berisi angka
        if (!isNumeric(digitSaja)) {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Kartu kredit hanya boleh berisi angka dan tanda hubung.");
        }
        // 3. Memeriksa panjang total harus tepat 16 digit
        else if (digitSaja.length() != 16) {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Jumlah digit harus tepat 16 digit.");
        } 
        // 4. Memeriksa digit pertama harus dimulai angka 4, 5, atau 6
        else if (!isValidFirstDigit(digitSaja.charAt(0))) {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Harus dimulai dengan 4, 5, atau 6.");
        } 
        // 5. Memeriksa format tanda hubung jika ada (harus dipisah tepat setiap 4 digit)
        else if (nomorKartu.contains("-") && !isValidFormatDenganDash(nomorKartu)) {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Format tanda hubung harus dipisah setiap 4 digit (contoh: XXXX-XXXX-XXXX-XXXX).");
        } 
        // Jika seluruh kondisi terpenuhi
        else {
            System.out.println("Nomor kartu valid.");
        }

        input.close();
    }

    // Method pembantu untuk mengecek apakah string hanya berisi karakter angka
    private static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    // Method pembantu untuk mengecek digit awal (4, 5, atau 6)
    private static boolean isValidFirstDigit(char firstChar) {
        return firstChar == '4' || firstChar == '5' || firstChar == '6';
    }

    // Method pembantu untuk memastikan posisi tanda hubung tepat berada di indeks 4, 9, dan 14 (XXXX-XXXX-XXXX-XXXX)
    private static boolean isValidFormatDenganDash(String nomorKartu) {
        // Tepat 19 karakter (16 digit + 3 tanda hubung)
        if (nomorKartu.length() != 19) {
            return false;
        }

        // Tanda hubung wajib berada pada indeks 4, 9, dan 14
        return nomorKartu.charAt(4) == '-' && 
               nomorKartu.charAt(9) == '-' && 
               nomorKartu.charAt(14) == '-';
    }
}