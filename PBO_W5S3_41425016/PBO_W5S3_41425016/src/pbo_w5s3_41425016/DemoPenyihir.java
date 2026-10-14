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

// Kelas induk Penyihir
class Penyihir {
    // Method yang dapat diubah oleh kelas anak
    public void ucapkanMantra() {
        System.out.println("Penyihir mengucapkan mantra.");
    }
}

// Kelas HarryPotter mewarisi Penyihir
class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan Expelliarmus!");
    }
}

// Kelas Hermione mewarisi Penyihir
class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan Wingardium Leviosa!");
    }
}

// Kelas RonWeasley mewarisi Penyihir
class RonWeasley extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra!");
    }
}

// Kelas utama
public class DemoPenyihir {
    public static void main(String[] args) {
        // Membuat objek penyihir
        Penyihir harry = new HarryPotter();
        Penyihir hermione = new Hermione();
        Penyihir ron = new RonWeasley();
        // Memanggil method yang sama
        harry.ucapkanMantra();
        hermione.ucapkanMantra();
        ron.ucapkanMantra();
    }
}

/*
Pertanyaan:
 Apa yang terjadi jika kita tidak menggunakan annotation @Override? Apakah kode 
masih berjalan?
jawab:
Masih dapat berjalan, kode tetap berjalan jika method yang dibuat benar-benar m
enimpa method dari kelas induk. @Override membantu mendeteksi kesalahan ketika 
method tidak sesuai dengan method induknya.

 Apa keuntungan menggunakan polymorphism dalam contoh ini?
jawab:
Polymorphism memungkinkan Harry Potter dan Hermione menggunakan method ucapkanMantra() 
yang sama, tetapi menghasilkan perilaku berbeda. Dengan demikian, kode lebih 
fleksibel dan mudah dikembangkan.
*/