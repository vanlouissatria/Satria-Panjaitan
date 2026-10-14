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
 * MotorKurir (subclass konkret dari KendaraanEkspedisi)
 * Dipakai pada Eksperimen 2. Pada eksperimen, method angkutBarang() sengaja
 * dikosongkan untuk melihat error IDE. Di file setoran ini method sudah
 * diimplementasikan supaya seluruh project bisa dikompilasi.
 */
class MotorKurir extends KendaraanEkspedisi {
    // Meneruskan nomor polisi dan kapasitas ke constructor parent
    public MotorKurir(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi abstract method angkutBarang() (perbaikan dari error Eksperimen 2)
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Motor Kurir [" + noPolisi + "] membawa '" + namaBarang +
                "' di box belakang untuk pengantaran jarak dekat.");
    }
}
