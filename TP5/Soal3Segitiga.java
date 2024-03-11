
package soal3segitiga;
import java.util.Scanner;

public class Soal3Segitiga {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi a:");
        int a = input.nextInt();

        System.out.println("Masukkan panjang sisi b:");
        int b = input.nextInt();

        System.out.println("Masukkan panjang sisi c:");
        int c = input.nextInt();

        // Urutkan sisi a, b, dan c dari terkecil ke terbesar
        sortSides(a, b, c);

        // Cek jenis segitiga
        checkTriangleType(a, b, c);

        input.close();
    }

    // Method prosedur untuk mengurutkan sisi a, b, dan c dari terkecil ke terbesar
    public static void sortSides(int a, int b, int c) {
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
    }

    // Method prosedur untuk mengecek jenis segitiga
    public static void checkTriangleType(int a, int b, int c) {
        if (a + b <= c) {
            System.out.println("Tidak membentuk segitiga");
        } else if (a * a + b * b == c * c) {
            System.out.println("Segitiga Siku-siku");
            System.out.println("Hasil perhitungan: " + a + "^2 + " + b + "^2 = " + (a * a) + " + " + (b * b) + " = " + (c * c));
        } else if (a * a + b * b < c * c) {
            System.out.println("Segitiga Tumpul");
            System.out.println("Hasil perhitungan: " + a + "^2 + " + b + "^2 = " + (a * a) + " + " + (b * b) + " < " + (c * c));
        } else {
            System.out.println("Segitiga Lancip");
            System.out.println("Hasil perhitungan: " + a + "^2 + " + b + "^2 = " + (a * a) + " + " + (b * b) + " > " + (c * c));
        }
    }
}
