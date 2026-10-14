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

import java.util.Scanner;

public class CekGanjilGenap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int a = input.nextInt();
       
        if (a % 2 == 0) {
            System.out.println(a + " adalah bilangan GENAP");
        } else {
            System.out.println(a + " adalah bilangan GANJIL");
        }
    }
}
