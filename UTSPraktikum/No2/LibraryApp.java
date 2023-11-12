package UTSPraktikum.No2;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        PenggunaPerpus pengguna;


        new Book("Dilan");
        new Book("Harry Potter");
        new Book("Antares");


        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        String username = input.nextLine().toLowerCase();

        if (username.equals("admin")) {
            pengguna = new Admin(username);
            ((Admin) pengguna).manageLibrary();
        } else {
            pengguna = new User(username);
            ((User) pengguna).displayMenu();
        }

        input.close();
    }
}
