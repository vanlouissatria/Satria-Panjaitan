/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s3_41425016;

/**
 *
 * @author Asus TUF
 */

import java.util.*;

public class Mantra {

    // Method ucapkan() dengan satu parameter
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Method overloading dengan dua parameter
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Method overloading dengan tiga parameter
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    // Method overloading dengan urutan parameter berbeda
    public void ucapkan(int kekuatan, String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra
                + " dengan kekuatan " + kekuatan);
    }

    // Method utama untuk menjalankan program
    public static void main(String[] args) {
        Mantra mantra = new Mantra();
        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");
        // Memanggil method dengan urutan parameter berbeda
        mantra.ucapkan(20, "Expelliarmus");
    }
}

/*
Pertanyaan:
 Apa yang terjadi jika kita menghapus salah satu method overloading? Misalnya, method
dengan dua parameter.
jawab:
Error: Main method not found in class pbo_w5s3_41425016.Mantra, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
C:\Users\Asus TUF\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\Asus TUF\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)
jika kita menghapus salah satu method overloading, maka akan terjadi error, yang
dimana seperti di error main method not found di class pbo_w5s3_41425016 yaitu
method mantra. Method lainnya tetap dapat digunnakan

 Bisakah kita membuat method overloading dengan urutan parameter yang berbeda? Coba
buat method ucapkan(int kekuatan, String namaMantra).
jawab:
Bisa. Contohnya ucapkan(String namaMantra, int kekuatan) dan ucapkan(int kekuatan,
String namaMantra). Java dapat membedakan kedua method tersebut berdasarkan tipe 
dan urutan parameternya.
*/