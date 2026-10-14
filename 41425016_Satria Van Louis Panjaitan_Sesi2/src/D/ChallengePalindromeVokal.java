/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D;

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

public class ChallengePalindromeVokal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata/kalimat: ");
        String teks = input.nextLine();

        String teksBersih = teks.replaceAll("\\s+", "").toLowerCase();
        String teksTebalik = new StringBuilder(teksBersih).reverse().toString();
        
        boolean isPalindrome = teksBersih.equals(teksTebalik);

        int jumlahVokal = 0;
        String teksLower = teks.toLowerCase();

        for (int i = 0; i < teksLower.length(); i++) {
            char c = teksLower.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                jumlahVokal++;
            }
        }

        System.out.println("\n--- Hasil Analisis Teks ---");
        System.out.println("Teks Asli: " + teks);
        System.out.println("Apakah Palindrome? " + (isPalindrome ? "Ya" : "Tidak"));
        System.out.println("Jumlah Huruf Vokal: " + jumlahVokal);
    }
}