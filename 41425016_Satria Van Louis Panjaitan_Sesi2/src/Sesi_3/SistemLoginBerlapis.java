/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sesi_3;

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

public class SistemLoginBerlapis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String VALID_USERNAME = "admin";
        final String VALID_PASSWORD = "password123";
        final int MAX_ATTEMPTS = 3;

        System.out.println("=== Sistem Login ===");
        for (int i = 1; i <= MAX_ATTEMPTS; i++) {
            System.out.println("\nPercobaan " + i + ":");
            
            System.out.print("Username: ");
            String username = input.nextLine();

            System.out.print("Password: ");
            String password = input.nextLine();

            if (!isValidUsername(username)) {
                System.out.println("Login gagal! Username harus antara 5-10 karakter.");
                continue;
            }

            if (!isValidPassword(password)) {
                System.out.println("Login gagal! Password harus minimal 8 karakter dan mengandung angka.");
                continue;
            }

            if (username.equals(VALID_USERNAME) && password.equals(VALID_PASSWORD)) {
                System.out.println("Login berhasil!");
                input.close();
                return; 
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        }

        System.out.println("\nAkun terkunci! Terlalu banyak percobaan gagal.");
        input.close();
    }
 
    public static boolean isValidUsername(String username) {
        return username.length() >= 5 && username.length() <= 10;
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true; 
            }
        }
        return false;
    }
}

// username : admin
// password : password123