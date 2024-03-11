
package soal1bilanganinputan;
import java.util.Scanner;
public class Soal1BilanganInputan {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n (n >= 1): ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Masukkan nilai n yang lebih besar dari atau sama dengan 1.");
        } else {
            System.out.println("Bilangan dari 1 sampai " + n + " adalah:");
            printNumbers(n);
        }

        scanner.close();
    }

    // Method untuk menampilkan bilangan dari 1 sampai n
    public static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}