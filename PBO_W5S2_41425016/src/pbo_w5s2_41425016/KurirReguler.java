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
 * KurirReguler (parent class)
 * Mewakili kurir motor biasa yang mengantar barang lewat jalur darat.
 */
class KurirReguler {
    // protected: bisa diakses langsung oleh subclass (misalnya KurirDrone)
    protected String nama;

    // Constructor: mengisi nama kurir
    public KurirReguler(String nama) {
        this.nama = nama;
    }

    // Perintah pengiriman standar. Versi ini akan di-override oleh subclass.
    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}
