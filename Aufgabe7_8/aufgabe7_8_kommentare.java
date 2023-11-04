package Aufgabe7_8;
import java.util.Scanner;
import java.lang.Math;
public class aufgabe7_8_kommentare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihren Winkeleingabe in Grad ein: ");
        double winkel_grad = scanner.nextDouble(); // winkel_grad: Variable vom Typ double mit dem Wert der Eingabe des Benutzers

        double winkel_bogen = winkelbogen(winkel_grad); // winkel_bogen: Variable vom Typ double mit dem Wert der Methode winkelbogen(winkel_grad) // winkelbogen(winkel_grad): Aufruf der Methode winkelbogen mit dem Parameter winkel_grad

        System.out.println(winkel_grad+" Grad => sin = "+sin(winkel_bogen, 20)); // Gib den Wert der Methode sin(winkel_bogen, 20) aus. 20: Anzahl der Terme
        System.out.println("Zum vergleich sin = "+Math.sin(winkel_bogen)); // Gib den Wert der Methode Math.sin(winkel_bogen) aus (Vergleichswert)

        scanner.close();
    }

    public static double winkelbogen(double winkel_grad) { // Umrechnung von Winkel in Bogenmaß
        return winkel_grad * Math.PI / 180; // Math.PI: Konstante für Pi (3.141592653589793) // return: Rückgabewert der Methode // winkel_grad * Math.PI / 180: Umrechnung von Grad in Bogenmaß
    }

    public static long fakultaet(int n) { // Berechnung der Fakultät
        long fakultaet = 1; // fakultaet: Variable vom Typ long mit dem Wert 1
        for (int i = 1; i <= n; i++) { // for-Schleife: i = 1; i <= n; i++: i wird mit 1 initialisiert, solange i kleiner oder gleich n ist, wird i um 1 erhöht
            fakultaet *= i; // fakultaet *= i: fakultaet = fakultaet * i
        }
        return fakultaet; // return: Rückgabewert der Methode
    }

    public static double potenz(double basis, int exponent) { // Berechnung der Potenz
        double potenz = 1; // potenz: Variable vom Typ double mit dem Wert 1
        for (int i = 0; i < exponent; i++) { // for-Schleife: i = 1; i <= exponent; i++: i wird mit 1 initialisiert, solange i kleiner oder gleich exponent ist, wird i um 1 erhöht
            potenz *= basis; // potenz *= basis: potenz = potenz * basis
        }
        return potenz; // return: Rückgabewert der Methode
    }

    public static double sin(double winkel, int terme) { // Berechnung der Sinusfunktion
        double sin = 0; // sin: Variable vom Typ double mit dem Wert 0
        for (int i = 0; i < terme; i++) { // for-Schleife: i = 0; i < terme; i++: i wird mit 0 initialisiert, solange i kleiner terme ist, wird i um 1 erhöht
            sin += potenz(-1, i) * potenz(winkel, 2 * i + 1) / fakultaet(2 * i + 1); // sin += potenz(-1, i) * potenz(winkel, 2 * i + 1) / fakultaet(2 * i + 1): sin = sin + potenz(-1, i) * potenz(winkel, 2 * i + 1) / fakultaet(2 * i + 1)
        }
        return sin; // return: Rückgabewert der Methode
    }
}
