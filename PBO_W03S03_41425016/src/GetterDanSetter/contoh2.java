/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetterDanSetter;

/**
 *
 * @author Asus TUF
 */

/*
    NIM     : 41425016
    NAMA    : Satria Van Louis Panjaitan
    Motto   : If at first you don't succeed, call it version 1.0.
*/

class GetSet1{
    private int num;
    // Method 1 - Setter
    public void setNumber(int number)
    {
        if(number < 1 || number > 10){
            throw new IllegalArgumentException();
        }
        num = number;
    }
    
    // Method 2 - Getter
    public int getNumber() { return num; }
}

class contoh2{
    public static void main(String[] args)
    {
        GetSet1 obj = new GetSet1();
        obj.setNumber(5);
        System.out.println(obj.getNumber());
    }
}
