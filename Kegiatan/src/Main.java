import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pilihan jenis login
        System.out.println("Pilih Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Tambahkan ini agar input username tidak dilewati

        if (pilihan == 1) { // Login Admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine(); // Sekarang bisa diinputkan
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            // Contoh username & password yang valid
            String validUsername = "Admin504";
            String validPassword = "Password504";

            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else if (pilihan == 2) { // Login Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            // Contoh validasi
            String validNama = "Muhamad Raihan Naja";
            String validNim = "202410370110504";

            if (nama.equals(validNama) && nim.equals(validNim)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
