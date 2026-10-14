/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author Asus TUF
 */

interface Switchable {
    void turnOn();
    void turnOff();
}

interface Connectable {
    void connectToWifi(String ssid, String ipAddress);
}

class SmartLamp implements Switchable, Connectable {

    private int brightness;
    private boolean isOn;

    public SmartLamp(int brightness) {
        this.brightness = brightness;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("[Lampu Pintar] Dinyalakan dengan kecerahan "
                + brightness + "%");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (!isOn) {
            System.out.println(
                "[WiFi Device] Gagal terhubung karena perangkat mati."
            );
        } else {
            System.out.println(
                "[WiFi Device] Terhubung ke jaringan: "
                + ssid + " (IP: " + ipAddress + ")"
            );
        }
    }
}

class SmartAC implements Switchable, Connectable {
    private int temperature;
    private boolean isOn;

    public SmartAC(int temperature) {
        this.temperature = temperature;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("[AC Pintar] Dinyalakan pada suhu "
                + temperature + " C");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("[AC Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (!isOn) {
            System.out.println(
                "[WiFi Device] Gagal terhubung karena perangkat mati."
            );
        } else {
            System.out.println(
                "[WiFi Device] Terhubung ke jaringan: "
                + ssid + " (IP: " + ipAddress + ")"
            );
        }
    }
}

public class SmartHome {
    public static void main(String[] args) {
        SmartLamp lampu = new SmartLamp(80);
        SmartAC ac = new SmartAC(22);

        lampu.turnOn();
        lampu.connectToWifi(
            "Rumah_Indah_5G",
            "192.168.1.50"
        );

        ac.turnOn();
        ac.connectToWifi(
            "Rumah_Indah_5G",
            "192.168.1.51"
        );

        ac.turnOff();
    }
}