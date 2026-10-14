/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s3_41425016;

/**
 *
 * @author Asus TUF
 */

import java.util.ArrayList;
import java.util.List;

// Abstract class untuk mantra perlindungan
abstract class MantraPerlindungan {

    // Method untuk mengaktifkan mantra
    public abstract void aktifkan();

    // Method untuk menonaktifkan mantra
    public abstract void nonaktifkan();
}

// Kelas Protego
class Protego extends MantraPerlindungan {

    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego dinonaktifkan.");
    }
}

// Kelas Fidelius
class Fidelius extends MantraPerlindungan {

    private String secretKeeper;

    public Fidelius(String secretKeeper) {
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Fidelius diaktifkan oleh "
                + secretKeeper + ".");
        System.out.println("Lokasi rahasia telah dilindungi!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Fidelius dinonaktifkan.");
    }
}

// Kelas MantraAntiApparition
class MantraAntiApparition extends MantraPerlindungan {

    private String area;

    public MantraAntiApparition(String area) {
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println("Perlindungan Anti-Apparition diaktifkan di "
                + area + ".");
        System.out.println("Apparition tidak dapat dilakukan di area ini!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perlindungan Anti-Apparition di " + area
                + " dinonaktifkan.");
    }
}

// Kelas untuk mengelola sistem pertahanan Hogwarts
class SistemPertahanan {

    private List<MantraPerlindungan> daftarMantra;

    public SistemPertahanan() {
        daftarMantra = new ArrayList<>();
    }

    // Menambahkan mantra ke sistem pertahanan
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra perlindungan berhasil ditambahkan.");
    }
    // Mengaktifkan semua mantra
    public void aktifkanSemuaMantra() {
        System.out.println("\n=== MENGAKTIFKAN PERTAHANAN HOGWARTS ===");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    // Menonaktifkan semua mantra
    public void nonaktifkanSemuaMantra() {
        System.out.println("\n=== MENONAKTIFKAN PERTAHANAN HOGWARTS ===");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}

// Kelas utama
public class TantanganHogwarts {
    public static void main(String[] args) {
        // Membuat objek sistem pertahanan
        SistemPertahanan sistem = new SistemPertahanan();
        // Membuat objek mantra perlindungan
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("Albus Dumbledore");
        MantraPerlindungan antiApparition = new MantraAntiApparition("Hogwarts");
        // Menambahkan mantra ke sistem pertahanan
        sistem.tambahMantra(protego);
        sistem.tambahMantra(fidelius);
        sistem.tambahMantra(antiApparition);
        // Mengaktifkan semua mantra
        sistem.aktifkanSemuaMantra();
        // Menonaktifkan semua mantra
        sistem.nonaktifkanSemuaMantra();
    }
}
