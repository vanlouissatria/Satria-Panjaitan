/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalizemethod;

/**
 *
 * @author Asus TUF
 */

/*
    NIM     : 41425016
    NAMA    : Satria Van Louis Panjaitan
    Motto   : If at first you don't succeed, call it version 1.0.
*/

public class Geeks {
    public static void main(String[] args) {

        Geeks t = new Geeks();
        System.out.println(t.hashCode());

        t = null;

        System.gc();

        System.out.println("end");
    }

    @Override
    protected void finalize()
    {
        System.out.println("finalize method called");
    }
}
