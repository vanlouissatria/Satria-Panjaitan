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
 * MesinTarif
 * Kelas ini menghitung tarif pengiriman di loket kasir LOGIX Express.
 * Method hitungOngkir() di-overload tiga kali: nama sama, tetapi daftar
 * parameternya berbeda, sehingga compiler bisa memilih versi yang tepat.
 */

class MesinTarif {
    // Kota asal pengiriman, di-private agar tidak bisa diubah langsung dari luar kelas
    private String kotaAsal;

    // Constructor: mengisi kota asal saat objek dibuat
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // Versi 1: ongkir dasar, hanya berdasarkan berat (Rp 10.000 per Kg)
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    // Versi 2: ongkir + asuransi untuk barang bernilai tinggi (asuransi 1% dari nilai barang)
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000) + biayaAsuransi;
    }

    // Versi 3: ongkir dengan opsi pengiriman Express (tambahan biaya Rp 20.000)
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;
        if (isExpress) {
            total += 20000; // biaya prioritas kilat
        }
        return total;
    }
}
