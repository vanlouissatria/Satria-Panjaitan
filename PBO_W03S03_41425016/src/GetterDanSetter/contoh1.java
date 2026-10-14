/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetterDanSetter;

/**
 *
 * @author Asus TUF
 */

class GetSet{
    private String name;
    
    // Method 1 - Getter
    public String getname() {return name; }
    
    // Method 2 -- Setter
    public void setName(String N)
    {
        this.name = N;
    }
}

class contoh1{
    public static void main(String[] args)
    {
        GetSet obj = new GetSet();
        
        obj.setName("Geeks for Geeks");
        System.out.println(obj.getname());
    }
}

