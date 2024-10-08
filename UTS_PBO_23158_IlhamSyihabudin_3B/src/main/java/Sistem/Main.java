/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sistem;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import Hotel.Hotel;
import Hotel.Room;
import User.Customer;
import User.Admin;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hotel hotel1 = new Hotel("Hotel Ilham");

        // Membuat Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

    {
            System.out.println("Selamat datang di Hotel Ilham");
            System.out.println("1. Log Costumer");
            System.out.println("2. Log Admin");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Login sebagai Customer
                    loginCustomer(hotel1, scanner);
                    break;
                case 2:
                    // Login sebagai Admin
                    loginAdmin(hotel1, scanner);
                    break;
                case 3:
                    System.out.println("Terima Kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // Proses login customer
    public static void loginCustomer(Hotel hotel, Scanner scanner) {
        System.out.println("Daftar Kamar:");
        hotel.tampilkanKamar();

        System.out.print("Pilih kamar (Standar, Superior , Deluxe): ");
        int kamarPilihan = scanner.nextInt();

        Room selectedRoom = null;
        if (kamarPilihan == 1) {
            selectedRoom = hotel.room1;
        } else if (kamarPilihan == 2) {
            selectedRoom = hotel.room2;
        } else if (kamarPilihan == 3) {
            selectedRoom = hotel.room3;
        }

        if (selectedRoom == null || selectedRoom.dipesan) {
            System.out.println("Kamar tidak valid atau sudah dipesan.");
            return;
        }

        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.next();
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();
        if (umur < 18) {
            System.out.println("KAMU MASIH DIBAWAH UMURR!!!");
            return;
        }

        System.out.print("Masukkan nomor KTP: ");
        String noIdentitas = scanner.next();
        System.out.print("Lama istirahat (hari): ");
        int lamaMenginap = scanner.nextInt();

        // Promo bulan Oktober
        int hargaAsli = selectedRoom.harga * lamaMenginap;
        int hargaDiskon = hargaAsli - (hargaAsli * 35 / 100);

        System.out.println("PROMO BULAN OKTOBER! Potongan 35%");

        // Membuat customer
        Customer customer = new Customer(nama, umur, noIdentitas, lamaMenginap);
        customer.tampilkanPesanan(hotel.namaHotel, selectedRoom.tipeKamar, hargaDiskon);

        // Tandai kamar sebagai dipesan
        selectedRoom.dipesan = true;
    }

    // Proses login admin
    public static void loginAdmin(Hotel hotel, Scanner scanner) {
        System.out.print("Masukkan nama admin: ");
        String nama = scanner.next();
        System.out.println("Daftar Kamar di " + hotel.namaHotel + ":");
        hotel.tampilkanKamar();

        System.out.print("Pilih kamar untuk diubah status menjadi belum dipesan (Standar, Superior, Deluxe): ");
        int kamarPilihan = scanner.nextInt();

        Room selectedRoom = null;
        if (kamarPilihan == 1) {
            selectedRoom = hotel.room1;
        } else if (kamarPilihan == 2) {
            selectedRoom = hotel.room2;
        } else if (kamarPilihan == 3) {
            selectedRoom = hotel.room3;
        }

        if (selectedRoom != null && selectedRoom.dipesan) {
              
        } else {
            System.out.println("Kamar tidak valid atau belum dipesan.");
        }
    }
}

  
