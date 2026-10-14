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
 * SimulasiOverriding
 * Program utama untuk mencoba Method Overriding (Runtime Polymorphism).
 * Kedua variabel bertipe KurirReguler, tetapi objek aslinya berbeda.
 */
public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");

        // Objek asli: KurirReguler
        KurirReguler k1 = new KurirReguler("Budi");

        // Variabel bertipe parent, tetapi objek aslinya KurirDrone (upcasting)
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        // Perintah sama, tetapi JVM memilih isi method berdasarkan objek aslinya saat runtime
        k1.kirimBarang("Jl. Sudirman No. 10");   // versi KurirReguler (jalur darat)
        k2.kirimBarang("Gedung Graha Lt. 5");    // versi KurirDrone (jalur udara)
    }
}

/*
Lembar Analisis Abstraksi
1. Hapus/komentari @Override pada KurirDrone, lalu ubah nama method menjadi 
kirimbarang (b kecil). Jalankan SimulasiOverriding.java. Apa output dari 
k2.kirimBarang("Gedung Graha Lt. 5")? Apakah masih "lewat jalur udara" atau 
berubah menjadi "lewat jalur darat"?
Outputnya berubah menjadi lewat jalur darat. Program tetap berhasil dikompilasi 
tanpa error, tetapi hasilnya salah. Output yang tercetak:
=== INI METHOD OVERRIDING ===
Budi mengantar paket ke Jl. Sudirman No. 10 lewat jalur darat menembus kemacetan.
Arka mengantar paket ke Gedung Graha Lt. 5 lewat jalur darat menembus kemacetan.

Penyebabnya, kirimbarang (b kecil) dianggap Java sebagai method baru yang 
berbeda nama dengan kirimBarang milik parent, jadi ini bukan overriding. 
Saat k2.kirimBarang(...) dipanggil, JVM tidak menemukan versi baru di KurirDrone 
dan memakai kirimBarang milik KurirReguler, yaitu jalur darat.
2. Kembalikan @Override di atas method yang salah ketik, lalu kompilasi ulang. 
Salin pesan error yang muncul.
KurirDrone.java:17: error: method does not override or implement a method from a supertype
    @Override
    ^
1 error

Nomor baris bisa berbeda di file masing-masing, bergantung pada susunan kode.

3. Jelaskan dengan bahasa sendiri fungsi utama @Override bagi programmer.
@Override adalah penanda untuk compiler bahwa method di bawahnya memang dimaksudkan 
untuk menimpa method milik parent class. Dengan penanda ini compiler ikut memeriksa: 
kalau ternyata tidak ada method di parent yang cocok, kompilasi langsung 
gagal. Tanpanya, kesalahan seperti kirimbarang tadi lolos kompilasi dan baru 
ketahuan dari hasil program yang aneh. Jadi fungsi utamanya adalah mengubah 
kesalahan yang tersembunyi menjadi error yang jelas saat kompilasi, sekaligus 
membuat kode lebih mudah dipahami karena pembaca langsung tahu method itu 
menimpa method parent.
*/