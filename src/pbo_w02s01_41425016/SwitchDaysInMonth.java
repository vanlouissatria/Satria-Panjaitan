/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus TUF
 */

package pbo_w02s01_41425016;

public class SwitchDaysInMonth {
    public static void main(String[] args) {
        int month = 2, year = 2024, days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
                break;
            default:
                break;
        }
    }
}