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
 * MobilVan (subclass konkret dari KendaraanEkspedisi)
 */
class MobilVan extends KendaraanEkspedisi {
    // Meneruskan nomor polisi dan kapasitas ke constructor parent
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi wajib dari abstract method angkutBarang()
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang +
                "' di bagasi belakang untuk distribusi kota.");
    }
}
