/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_w5s2_41425016;

/**
 *
 * @author Asus TUF
 */

/*
Nama    :   Satria Van Louis Panjaitan
NIM     :   41425016
Prodi   :   DIV-TRPL
*/

/*
 * SimulasiOverloading
 * Program utama untuk mencoba Method Overloading (Compile-Time Polymorphism).
 * Tiga pemanggilan hitungOngkir() di bawah memakai nama yang sama,
 * tetapi compiler memilih versi method dari jumlah dan tipe argumennya.
 */
public class SimulasiOverloading {
    public static void main(String[] args) {
        // Membuat objek mesin tarif dengan kota asal Medan
        MesinTarif tarif = new MesinTarif("Medan");

        System.out.println("=== INI METHOD OVERLOADING ===");

        // 1 argumen (double) -> versi ongkir dasar
        System.out.println("Ongkir Biasa (2.0 Kg)           : Rp " + tarif.hitungOngkir(2.0));

        // 2 argumen (double, double) -> versi dengan asuransi
        System.out.println("Ongkir + Asuransi (Barang 5Jt)  : Rp " + tarif.hitungOngkir(2.0, 5000000.0));

        // 2 argumen (double, boolean) -> versi express
        System.out.println("Ongkir Express (2.0 Kg)         : Rp " + tarif.hitungOngkir(2.0, true));
    }
}

/*
Lembar Analisis Abstraksi

1. Mengapa compiler Java dapat menentukan method hitungOngkir yang dijalankan 
sebelum program dieksekusi (compile-time)? Bagian method apa yang diperiksa 
compiler?
Compiler sudah tahu tipe dan jumlah argumen dari setiap pemanggilan method 
langsung di kode sumber. Jadi ia cukup mencocokkan argumen tersebut dengan 
daftar parameter dari tiap versi hitungOngkir yang ada di class MesinTarif. 
Bagian yang diperiksa adalah signature method, yaitu nama method, jumlah 
parameter, tipe parameter, dan urutan tipe parameternya. Dari program di modul, 
pencocokannya seperti ini:
Pemanggilan	Versi yang dipilih compiler
hitungOngkir(2.0)	hitungOngkir(double beratKg)
hitungOngkir(2.0, 5000000.0)	hitungOngkir(double, double) – dengan asuransi
hitungOngkir(2.0, true)	hitungOngkir(double, boolean) – express

Karena semuanya sudah bisa diputuskan saat kompilasi tanpa menunggu program 
berjalan, overloading disebut compile-time polymorphism. Hasil program: 
Rp 20000.0, Rp 70000.0, dan Rp 40000.0.

2. Jika ditambahkan method public int hitungOngkir(double beratKg), mengapa 
compiler menolak padahal tipe kembaliannya berbeda (int vs double)?
Karena return type bukan bagian dari signature method. Method baru itu memiliki 
nama dan parameter yang sama persis dengan hitungOngkir(double beratKg) yang 
sudah ada, jadi bagi compiler itu adalah method yang sama yang didefinisikan 
dua kali. Selain itu, pada pemanggilan seperti tarif.hitungOngkir(2.0), 
compiler tidak punya petunjuk untuk memilih salah satu, karena hasil pemanggilan 
bisa saja tidak ditampung ke variabel. Pesan error yang muncul saat saya coba:
MesinTarif.java:21: error: method hitungOngkir(double) is already defined in class MesinTarif
    public int hitungOngkir(double beratKg) {
               ^
1 error

Agar sah sebagai overloading, daftar parameternya harus berbeda (jumlah, tipe, 
atau urutannya), bukan hanya return type-nya.
*/