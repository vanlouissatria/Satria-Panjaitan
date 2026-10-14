/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author Asus TUF
 */

public class StudentGrade {
    private String nim;
    private String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private String gradeHuruf;

    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;

        this.nilaiKuis = 0.0;
        this.nilaiUTS = 0.0;

        updateGradeHuruf();
    }

    // Getter NIM
    public String getNim() {
        return nim;
    }

    // Getter Nama
    public String getNama() {
        return nama;
    }

    // Getter nilai kuis
    public double getNilaiKuis() {
        return nilaiKuis;
    }

    // Getter nilai UTS
    public double getNilaiUTS() {
        return nilaiUTS;
    }

    // Getter grade huruf
    public String getGradeHuruf() {
        return gradeHuruf;
    }

    // Setter nilai kuis
    public void setNilaiKuis(double nilaiKuis) {
        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            this.nilaiKuis = nilaiKuis;
            updateGradeHuruf();
        } else {
            System.out.println(
                "Nilai kuis harus berada antara 0.0 sampai 100.0."
            );
        }
    }

    // Setter nilai UTS
    public void setNilaiUTS(double nilaiUTS) {
        if (nilaiUTS >= 0.0 && nilaiUTS <= 100.0) {
            this.nilaiUTS = nilaiUTS;
            updateGradeHuruf();
        } else {
            System.out.println(
                "Nilai UTS harus berada antara 0.0 sampai 100.0."
            );
        }
    }

    // Menghitung nilai akhir
    public double hitungNilaiAkhir() {
        return (nilaiKuis * 0.40) + (nilaiUTS * 0.60);
    }

    // Method private untuk menentukan grade huruf
    private void updateGradeHuruf() {

        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 80) {
            gradeHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            gradeHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            gradeHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            gradeHuruf = "D";
        } else {
            gradeHuruf = "E";
        }
    }

    // Menampilkan laporan hasil studi
    public void cetakLaporan() {
        System.out.println("===== LAPORAN HASIL STUDI =====");
        System.out.println("NIM          : " + nim);
        System.out.println("Nama         : " + nama);
        System.out.println("Nilai Kuis   : " + nilaiKuis);
        System.out.println("Nilai UTS    : " + nilaiUTS);
        System.out.println("Nilai Akhir  : " + hitungNilaiAkhir());
        System.out.println("Grade Huruf  : " + gradeHuruf);
    }

    public static void main(String[] args) {

        StudentGrade student =
                new StudentGrade("41425016", "Satria");

        student.setNilaiKuis(100);
        student.setNilaiUTS(80);

        // Mencoba memasukkan nilai di luar rentang
        student.setNilaiKuis(120);

        student.cetakLaporan();
    }
}