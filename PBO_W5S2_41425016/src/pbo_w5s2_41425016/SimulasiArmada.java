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
 * SimulasiArmada (Tantangan Ekstra: Polimorfisme)
 * Array bertipe parent class diisi objek child class yang berbeda-beda,
 * lalu semuanya diproses dengan satu for-loop tanpa mengecek jenis objeknya.
 */
public class SimulasiArmada {
    public static void main(String[] args) {
        System.out.println("=== TANTANGAN EKSTRA: POLIMORFISME ===");

        // Array bertipe parent (KendaraanEkspedisi) berisi tiga jenis child class
        KendaraanEkspedisi[] armada = {
            new TrukBox("B 9081 TXT", 5000),
            new MobilVan("B 1122 KAA", 800),
            new MotorKurir("BK 4455 DEL", 50)
        };

        // Satu for-loop untuk semua objek. Tidak ada if/instanceof:
        // JVM otomatis memilih angkutBarang() milik objek aslinya saat runtime.
        for (KendaraanEkspedisi kendaraan : armada) {
            kendaraan.infoKendaraan();
            kendaraan.angkutBarang("Paket Sembako");
            System.out.println();
        }
    }
}

/*
Array bertipe parent class KendaraanEkspedisi diisi tiga objek child class berbeda 
(TrukBox, MobilVan, MotorKurir), lalu diproses dengan satu for-loop. Tidak ada 
if atau instanceof, karena JVM memilih angkutBarang() sesuai objek aslinya saat
runtime (file SimulasiArmada.java).
KendaraanEkspedisi[] armada = {
    new TrukBox("B 9081 TXT", 5000),
    new MobilVan("B 1122 KAA", 800),
    new MotorKurir("BK 4455 DEL", 50)
};
 
for (KendaraanEkspedisi kendaraan : armada) {
    kendaraan.infoKendaraan();
    kendaraan.angkutBarang("Paket Sembako");
}

Output:
Plat Nomor: B 9081 TXT | Daya Angkut: 5000 Kg
Truk [B 9081 TXT] memuat 'Paket Sembako' ke dalam kontainer tertutup pendingin.
 
Plat Nomor: B 1122 KAA | Daya Angkut: 800 Kg
Mobil Van [B 1122 KAA] memuat 'Paket Sembako' di bagasi belakang untuk distribusi kota.
 
Plat Nomor: BK 4455 DEL | Daya Angkut: 50 Kg
Motor Kurir [BK 4455 DEL] membawa 'Paket Sembako' di box belakang untuk pengantaran jarak dekat.
*/
