package UTSPraktikum.No2;

import java.util.Scanner;

public class PenggunaPerpus {
    private String username;

    public PenggunaPerpus(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void displayAllBooks() {
        System.out.println("\nList Buku :");
        for (Book book : Book.getAllBooks()) {
            System.out.println(book);
        }
    }
}