package B;

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

/*
    NIM     : 41425016
    NAMA    : Satria Van Louis Panjaitan
    Motto   : If at first you don't succeed, call it version 1.0.
*/

import java.util.Scanner;

public class MenghitungNilaiRatarata {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai 1: ");
        int a = input.nextInt();
        System.out.println("Masukkan nilai 2: ");
        int b = input.nextInt();
        System.out.println("Masukkan nilai 3: ");
        int c = input.nextInt();
       
        double rataRata = (double) (a + b + c) / 3;
        System.out.printf("Rata-rata: %.2f\n", rataRata);
    }
}