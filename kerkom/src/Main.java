import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();
        System.out.print("Masukan nim: ");
        int Nim = scanner.nextInt();
        System.out.println("Halo, " + name + Nim + "! Selamat datang.");

        scanner.close();
    }
}
