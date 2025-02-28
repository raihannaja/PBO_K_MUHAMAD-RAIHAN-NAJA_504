import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();

        System.out.println("Halo, " + name + "! Selamat datang.");

        scanner.close();
    }
}
