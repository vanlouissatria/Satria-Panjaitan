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

public class Kalkulator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.println("Masukkan angka kedua: ");
        int b = input.nextInt();
        
        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + ((double) a / b));
    }
}

/*
Mengapa pembagian int perlu di-casting ke double?
Karna pada kode program tersebut penggunaan double ketika ada pembagian,
yang dimana jika pembagian dapat menghasilkan dibelakang koma. Contohnya
5 : 2 = 2.50

Apa risiko jika pembagi = 0?
Jika pembaginya adalah nol, maka akan menghasilkan nilai tak terhingga, 
seperti pada kode jika saya coba akan menghasilkan output Infinity
*/