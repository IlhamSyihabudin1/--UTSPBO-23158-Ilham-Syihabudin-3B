/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author ASUS
 */
//pendeklarasian atribut
public class Customer {
    //menyimpan nama pelanggan
    public String nama;
    //menyimpan umur pelanggan
    public int umur;
    //menyimpan nomer identitas (KTP) pelanggan
    public String noIdentitas;
    //menyimpan berapa lama pelanggan menginap
    public int lamaMenginap;

    //parameter ini untuk mengisi data dari seorang pelanggan
    public Customer(String nama, int umur, String noIdentitas, int lamaMenginap) {
        //di isi dengan parameter yang diberikan
        this.nama = nama;
        this.umur = umur;
        this.noIdentitas = noIdentitas;
        this.lamaMenginap = lamaMenginap;
    }

    // menampilkan detail pesanan customer
    public void tampilkanPesanan(String hotel, String kamar, int totalHarga) {
        System.out.println("Detail Pesanan:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("No Identitas: " + noIdentitas);
        //nama hotel yang dipilih pelanggan
        System.out.println("Hotel: " + hotel);
        //tipe kamar yang dipesan pelanggan
        System.out.println("Kamar: " + kamar);
        //data untuk memberitau berapa lama pelanggan menginap
        System.out.println("Lama Menginap: " + lamaMenginap + " hari");
        //total harga keluar apa bila pelanggan menginep berapa lama
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}

    