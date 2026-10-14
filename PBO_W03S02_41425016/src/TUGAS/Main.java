/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS;

/**
 *
 * @author Asus TUF
 */

/*
    NIM     : 41425016
    NAMA    : Satria Van Louis Panjaitan
    Motto   : If at first you don't succeed, call it version 1.0.
*/

// Superclass
class Mahasiswa {
    String nama;
    String nim;
}

// Subclass yang mewarisi Mahasiswa
class MahasiswaAktif extends Mahasiswa {
    int semester;

    void belajar() {
        System.out.println(nama + " sedang belajar di semester " + semester);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari MahasiswaAktif
        MahasiswaAktif mhs = new MahasiswaAktif();
        
        // Mengisi data objek
        mhs.nama = "Dina";
        mhs.nim = "123456";
        mhs.semester = 5;

        // Menampilkan output
        System.out.println("Nama: " + mhs.nama);
        System.out.println("NIM: " + mhs.nim);
        mhs.belajar();
    }
}
