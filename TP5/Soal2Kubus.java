
package soal2kubus;
import java.util.Scanner;
public class Soal2Kubus {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi 1: ");
        double sisi1 = scanner.nextDouble();

        System.out.println("Masukkan panjang sisi 2: ");
        double sisi2 = scanner.nextDouble();

        System.out.println("Masukkan panjang sisi 3: ");
        double sisi3 = scanner.nextDouble();

        if (isKubus(sisi1, sisi2, sisi3)) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }

        scanner.close();
    }

    public static boolean isKubus(double sisi1, double sisi2, double sisi3) {
        // Untuk menjadi kubus, semua sisinya harus sama
        if (sisi1 == sisi2 && sisi2 == sisi3) {
            return true;
        } else {
            return false;
        }
    }
}
