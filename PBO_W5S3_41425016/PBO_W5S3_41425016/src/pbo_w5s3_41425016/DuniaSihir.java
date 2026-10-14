/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s3_41425016;

/**
 *
 * @author Asus TUF
 */

import java.util.ArrayList;
import java.util.List;

// Abstract class untuk semua mantra
abstract class Mantra {
    private String nama;
    // Constructor untuk menyimpan nama mantra
    public Mantra(String nama) {
        this.nama = nama;
    }

    // Mengambil nama mantra
    public String getNama() {
        return nama;
    }

    // Abstract method untuk efek mantra
    public abstract void efek();
}

// Kelas Expelliarmus
class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

// Kelas ExpectoPatronum
class ExpectoPatronum extends Mantra {

    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

// Kelas Lumos
class Lumos extends Mantra {

    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

// Kelas Penyihir
class Penyihir {
    private String nama;
    private List<Mantra> mantraList;

    // Constructor penyihir
    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    // Menambahkan mantra yang dipelajari
    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);

        System.out.println(nama + " belajar mantra: "
                + mantra.getNama());
    }

    // Mengucapkan satu mantra berdasarkan nama
    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: "
                        + mantra.getNama());

                mantra.efek();
                return;
            }
        }

        System.out.println(nama + " belum belajar mantra "
                + namaMantra);
    }

    // Mengucapkan semua mantra yang sudah dipelajari
    public void ucapkanSemuaMantra() {
        System.out.println("\n" + nama + " mengucapkan semua mantra:");
        for (Mantra mantra : mantraList) {
            System.out.println("Mantra: " + mantra.getNama());
            mantra.efek();
        }
    }
}

// Kelas utama
public class DuniaSihir {

    public static void main(String[] args) {

        // Membuat objek penyihir
        Penyihir harry = new Penyihir("Harry Potter");

        // Membuat objek mantra
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();
        Mantra lumos = new Lumos();

        // Harry mempelajari dua mantra
        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        // Mengucapkan satu mantra
        System.out.println();
        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");

        // Mencoba mantra yang belum dipelajari
        harry.ucapkanMantra("Lumos");

        // Harry mempelajari mantra Lumos
        System.out.println();
        harry.belajarMantra(lumos);

        // Mengucapkan semua mantra yang telah dipelajari
        harry.ucapkanSemuaMantra();
    }
}

/*
 Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini?
jawab:
Abstract class Mantra menjadi dasar untuk semua jenis mantra. Polymorphism memungkinkan 
setiap mantra memiliki method efek() yang sama, tetapi menghasilkan efek atau output 
yang berbeda sesuai jenis mantranya.

 Apa yang akan terjadi jika kita menambahkan mantra baru tanpa mengubah
kelas Penyihir? Apakah mudah? Mengapa?
jawab:
Kita cukup membuat kelas mantra baru yang mewarisi Mantra dan mengimplementasikan 
method efek(). Setelah itu, mantra dapat ditambahkan ke penyihir menggunakan 
method belajarMantra(). Cara ini mudah karena kelas Penyihir tidak perlu diubah 
setiap kali ada mantra baru.
*/