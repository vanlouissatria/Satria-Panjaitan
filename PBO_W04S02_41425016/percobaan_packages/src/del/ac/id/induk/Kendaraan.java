/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package del.ac.id.induk;

/**
 *
 * @author Asus TUF
 */

public class Kendaraan implements IKendaraan {
    private int jlhRoda, dimensiKendaraan, jlhSpion;
    private String warnaKendaraan;

    public Kendaraan() {}

    // ERROR 1: Mengubah 'public' menjadi 'protected' melanggar aturan interface IKendaraan
    @Override
    protected void setJlhRoda(int value) {
        jlhRoda = value;
    }

    @Override
    protected void setDimensiKendaraan(int value) {
        dimensiKendaraan = value;
    }

    @Override
    protected void setJlhSpion(int value) {
        jlhSpion = value;
    }

    @Override
    protected void setWarnaKendaraan(String value) {
        warnaKendaraan = value;
    }

    @Override
    protected void cetakInformasi(Object o) {
        if (o == null) System.out.println("Object is Null");
    }

    @Override
    protected int getJlhRoda() {
        return jlhRoda;
    }

    @Override
    protected int getDimensiKendaraan() {
        return dimensiKendaraan;
    }

    @Override
    protected int getJlhSpion() {
        return jlhSpion;
    }

    @Override
    protected String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    @Override
    protected float kalkulasiPercepatan(int jlhTorsi, float panjangGagang, float rasioGigi) {
        return jlhTorsi * panjangGagang * rasioGigi;
    }
}