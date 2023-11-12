package UTSPraktikum.No1;

import java.util.Scanner;

public class HewanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String jenisHewan = scanner.nextLine();

        Hewan hewan;

        // Membuat objek berdasarkan input pengguna
        if (jenisHewan.equalsIgnoreCase("Kucing")) {
            hewan = new Kucing();
        } else if (jenisHewan.equalsIgnoreCase("Anjing")) {
            hewan = new Anjing();
        }else{
            System.out.println("Jenis hewan tidak dikenal.");
            return;
        }

        // Menampilkan suara hewan
        System.out.print("Suara hewan: ");
        hewan.bersuara();

        // Mengecek apakah hewan adalah mamalia
        if (hewan.adalahMamalia()) {
            System.out.println("Hewan ini adalah mamalia.");
        } else {
            System.out.println("Hewan ini bukan mamalia.");
        }
    }
}