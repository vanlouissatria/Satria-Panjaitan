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
 * KurirDrone (child class dari KurirReguler)
 * Kurir drone mengantar lewat udara, jadi kirimBarang() ditulis ulang (override).
 */

class KurirDrone extends KurirReguler {
    // Atribut tambahan yang hanya dimiliki drone
    private String idDrone;

    // Constructor: nama diteruskan ke parent lewat super(), idDrone disimpan di sini
    public KurirDrone(String nama, String idDrone) {
        super(nama);
        this.idDrone = idDrone;
    }

    // @Override membuat compiler memeriksa bahwa method ini benar-benar
    // menimpa method milik parent (nama dan parameternya harus sama persis)
    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama +
                " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}
