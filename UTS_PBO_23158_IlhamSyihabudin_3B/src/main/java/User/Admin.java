/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author ASUS
 */
public class Admin {
    // Menampilkan daftar kamar dan memberi opsi untuk mengubah status pemesanan
    public void ubahStatusKamar(Hotel.Room room) {
        room.batalkanPesanan();
        System.out.println("Status kamar " + room.tipeKamar + " telah diubah menjadi belum dipesan.");
    }
}


