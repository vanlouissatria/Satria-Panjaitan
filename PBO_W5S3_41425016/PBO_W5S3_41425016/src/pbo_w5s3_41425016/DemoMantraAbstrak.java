/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w5s3_41425016;

/**
 *
 * @author Asus TUF
 */

import java.util.*;

abstract class MantraAbstrak{
    private String nama;
    public MantraAbstrak(String nama){
        this.nama = nama;
    }
    // Abstract method: harus diimplementasikan oleh subclass
    public abstract void efek();
    // Method konkret
    public void ucapkan(){
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

class Expelliarmus extends MantraAbstrak {
    public Expelliarmus(){
        super("Expelliarmus");
    }
    
    @Override
    public void efek(){
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

class ExpectoPatronum extends MantraAbstrak{
    public ExpectoPatronum(){
        super("ExpectoPatronum");
    }
    
    @Override
    public void efek(){
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor");
    }
}

class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Menghasilkan cahaya dari tongkat.");
    }
}

public class DemoMantraAbstrak{
    public static void main(String[] args){
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos();
        mantra1.ucapkan();
        mantra2.efek();
        
        mantra2.ucapkan();
        mantra2.efek();
        
        mantra3.ucapkan();
        mantra3.efek();
    }
}

/*
 Apa yang terjadi jika kita mencoba membuat objek dari MantraAbstrak langsung?
Coba dan jelaskan errornya.
jawab:
Program akan mengalami error karena abstract class tidak dapat dibuat objeknya 
secara langsung.
Contoh kode -> MantraAbstrak mantra = new MantraAbstrak("Mantra");
Kode tersebut menghasilkan error karena MantraAbstrak merupakan abstract class. 
Objek harus dibuat melalui kelas turunannya, seperti Expelliarmus atau Lumos.

 Mengapa kita perlu membuat abstract class? Apa keuntungannya?
jawab:
Abstract class digunakan sebagai dasar bagi kelas turunannya. Keuntungannya adalah 
setiap kelas turunan memiliki struktur yang sama, tetapi dapat mempunyai implementasi 
method efek() yang berbeda. Program juga menjadi lebih teratur dan mudah dikembangkan.
*/