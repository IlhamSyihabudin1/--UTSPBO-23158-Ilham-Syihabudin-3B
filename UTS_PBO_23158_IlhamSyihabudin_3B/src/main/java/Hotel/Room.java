/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author ASUS
 */
public class Room {
   //pendeklarasian suatu kamar yang dimana menyimpan tipe kamar apa saja yang ada
    public String tipeKamar;
    public int harga;
    public boolean dipesan;
    
    //sebuah konstruktor yang memiliki obejk room, parameter tipe dan harga, false berperan untuk memberitahu kamar yang dipesan tidak tersedia
    public Room(String tipe, int harga) {
        tipeKamar = tipe;
        this.harga = harga;
        dipesan = false;
    }

    // methode menampilkan informasi kamar apakah masih tersedia atau tidak
    public void tampilkanInfoKamar() {
        String status = dipesan ? "Telah Dipesan" : "Tersedia";
        System.out.println(tipeKamar + " - Harga: Rp " + harga + " - Status: " + status);
    }

    // mengubah status kamar menjadi belum dipesan (digunakan oleh admin)
    public void batalkanPesanan() {
        dipesan = false;
    }
}

    