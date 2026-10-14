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
 * SimulasiAbstraksi
 * Program utama untuk mencoba Abstract Class.
 */
public class SimulasiAbstraksi {
    public static void main(String[] args) {
        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: Menguji larangan instansiasi langsung abstract class
        // (dikomentari karena menyebabkan error kompilasi)
        // KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        // PERCOBAAN 2: Instansiasi dari subclass konkret
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan();                    // concrete method warisan dari parent
        fuso.angkutBarang("20 Unit Kulkas");     // implementasi milik TrukBox

        System.out.println("---------------------------------");

        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu");
    }
}

/*
Eksperimen 1. Salin pesan error saat baris PERCOBAAN 1 di-uncomment. Mengapa Java 
menggagalkan baris kode ini?
SimulasiAbstraksi.java:11: error: KendaraanEkspedisi is abstract; cannot be instantiated
        KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);
                               ^
1 error

Sesuai Kotak Insight Konsep, KendaraanEkspedisi hanyalah konsep atau cetak biru 
yang belum lengkap, seperti memesan "1 unit Kendaraan Ekspedisi" di dealer tanpa 
menyebut jenisnya. Class ini punya abstract method angkutBarang() yang belum ada
isinya, jadi kalau objeknya boleh dibuat, pemanggilan angkutBarang() tidak punya
perilaku apa pun yang bisa dijalankan. Karena itu Java melarang new pada abstract 
class. Objek hanya boleh dibuat dari subclass konkret seperti TrukBox atau MobilVan.

Eksperimen 2. Class MotorKurir extends KendaraanEkspedisi tanpa isi angkutBarang(). 
Dua opsi perbaikan dari IDE.
Pesan error dari compiler:
MotorKurir.java:1: error: MotorKurir is not abstract and does not override abstract method angkutBarang(String) in KendaraanEkspedisi
class MotorKurir extends KendaraanEkspedisi {
^
1 error

Dua opsi solusi yang ditawarkan IDE (Quick Fix / Alt+Enter):
1. Implement all abstract methods (NetBeans); Implement methods (IntelliJ); Add 
unimplemented methods (Eclipse)	
Penjelasan -> IDE membuatkan kerangka method angkutBarang(String namaBarang) 
di MotorKurir, tinggal diisi dengan perilaku motor kurir.

2. Make class MotorKurir abstract (NetBeans); Make 'MotorKurir' abstract 
(IntelliJ); Make type 'MotorKurir' abstract (Eclipse)	
Penjelasan -> MotorKurir dijadikan abstract class juga, sehingga tidak wajib 
mengimplementasikan angkutBarang(), tetapi tidak bisa lagi dibuat objeknya dengan new.
*/
