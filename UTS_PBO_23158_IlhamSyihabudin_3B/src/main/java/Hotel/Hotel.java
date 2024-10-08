/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author ASUS
 */
public class Hotel {
    //nama hotel adalah string yang menyimpan nama hotel
     public String namaHotel;
     //yang menampilkan kamar kamar yang ada dihotel
    public Room room1, room2, room3;

    //konstruktor untuk memanggil nama hotel
    public Hotel(String nama) {
        //untuk memberikan nama pada hotel
        namaHotel = nama;
        // Menyediakan daftar kamar dan harga
        room1 = new Room("Standar", 500000);
        room2 = new Room("Superior",  1500000);
        room3 = new Room("Deluxe",  3200000);
    }

    // Methode untuk menampilkan kamar yang tersedia di hotel
    public void tampilkanKamar() {
        //ditampilkan terlebih daluhu nama hotel dilanjut dengan memanggil methode room
        System.out.println("Hotel: " + namaHotel);
        room1.tampilkanInfoKamar();
        room2.tampilkanInfoKamar();
        room3.tampilkanInfoKamar();
    }
}

