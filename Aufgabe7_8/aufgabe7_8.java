package Aufgabe7_8;
import java.util.Scanner;
import java.lang.Math;
public class aufgabe7_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie ihren Winkeleingabe in Grad ein: ");
        double winkel_grad = scanner.nextDouble();

        double winkel_bogen = winkelbogen(winkel_grad);

        System.out.println(winkel_grad+" Grad => sin = "+sin(winkel_bogen, 20));
        System.out.println("Zum vergleich sin = "+Math.sin(winkel_bogen));

        scanner.close();
    }

    public static double winkelbogen(double winkel_grad) {
        return winkel_grad * Math.PI / 180;
    }

    public static long fakultaet(int n) {
        long fakultaet = 1;
        for (int i = 1; i <= n; i++) {
            fakultaet *= i;
        }
        return fakultaet;
    }

    public static double potenz(double basis, int exponent) {
        double potenz = 1;
        for (int i = 0; i < exponent; i++) {
            potenz *= basis;
        }
        return potenz;
    }

    public static double sin(double winkel, int terme) {
        double sin = 0;
        for (int i = 0; i < terme; i++) {
            sin += potenz(-1, i) * potenz(winkel, 2 * i + 1) / fakultaet(2 * i + 1);
        }
        return sin;
    }
}
