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

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheitHasil = (celsius * 9.0 / 5.0) + 32;
        System.out.println(celsius + " C = " + fahrenheitHasil + " F");

        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsiusHasil = (fahrenheit - 32) * 5.0 / 9.0;
        
        System.out.printf("%.1f F = %.2f C\n", fahrenheit, celsiusHasil);
    }
}