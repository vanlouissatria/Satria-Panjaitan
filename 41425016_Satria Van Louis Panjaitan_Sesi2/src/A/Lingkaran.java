package A;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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

public class Lingkaran {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        
        System.out.println("Masukkan jari jari: ");
        double r = input.nextDouble();
        
        if (r < 0){
            System.out.println("Error: jari jari tidak boleh negatif.");
        } else {
            double luas = PI * r * r;
            double keliling = 2 * PI * r;
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }
    }
}

/*
Mengapa kita perlu validasi r < 0?
karena jika tidak dibatasi, user dapat memasukkan jari jari yang bernilai minus,
yang dimana jari jari tidak boleh minus.

Dalam aplikasi nyata, di mana validasi input sangat penting?
Pada pengisian data umur, mencegah input tanggal lahir yang di masa depan,
atau pada pengisian nomor telepon agar hanya dapat mengetik nomor pada
pengisian nomor telepon
*/
