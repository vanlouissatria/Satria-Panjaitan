/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CopyConstructor;

/**
 *
 * @author Asus TUF
 */

/*
    NIM     : 41425016
    NAMA    : Satria Van Louis Panjaitan
    Motto   : If at first you don't succeed, call it version 1.0.
*/

class Geeks{
    String name;
    int id;
    
    Geeks(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    
    // Copy Constructor
    Geeks(Geeks obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}

public class Main {
    public static void main(String[] args)
    {
        System.out.println("First Object");
        Geeks geek1 = new Geeks("Sweta", 68);
        System.out.println("GeekName: " + geek1.name
                            + " and geekId: " + geek1.id);
        
        System.out.println();
        
        Geeks geek2 = new Geeks(geek1);
        System.out.println(
            "Copy Constructor used Second Object");
        System.out.println("GeekName: " + geek2.name
                            + " and GeekId: " + geek2.id);
    }
}
