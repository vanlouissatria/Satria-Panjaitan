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

public class OperasiString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama lengkap: ");
        String nama = input.nextLine();
        
        System.out.println("Panjang string: " + nama.length());
        System.out.println("Huruf pertama: " + nama.charAt(0));
        System.out.println("Mengandung spasi? " + nama.contains(" "));
    }
}

/*
Bagaimana jika nama yang diinput dengan lebih dari satu spasi?
jika lebih dari satu spasi maka panjang string nya akan bertambah 1
contohnya saya memasukkan Satria Van Louis Panjaitan, maka panjang stringnya 26,
tetapi jika saya melebihkan satu spasi maka stringnya akan menjadi 27
*/