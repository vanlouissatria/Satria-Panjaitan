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
 * KendaraanEkspedisi (abstract class)
 * Cetak biru semua kendaraan LOGIX Express. Tidak boleh dibuat objeknya
 * dengan new, karena jenis kendaraannya belum jelas.
 */
abstract class KendaraanEkspedisi {
    // Atribut umum yang diwariskan ke semua kendaraan
    protected String noPolisi;
    protected int kapasitasKg;

    // Constructor abstract class tetap ada, dipanggil subclass lewat super()
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Concrete method: punya isi, langsung diwarisi oleh semua subclass
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    // Abstract method: tanpa isi, wajib diimplementasikan oleh subclass konkret
    public abstract void angkutBarang(String namaBarang);
}
