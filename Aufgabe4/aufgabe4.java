package Aufgabe4;
import java.util.Scanner;

public class aufgabe4 {
    static public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Das Programm berechnet die Zinsen Ihres Kapitals\n");
        System.out.print("Geben Sie Iher Kapital ein: ");
        double kapital = scanner.nextDouble();
        double zwischenergebnis = kapital;
        double kapitalertrag = 0;
        System.out.print("\nGeben Sie Iheren Jaerlichen Zinssatz ein z.B. 2 = 2%: ");
        double zinssatz = scanner.nextDouble();
        zinssatz /= 100; // z.B. 5 / 100 = 0.05
        zinssatz += 1; // z.B. 0.05 + 1 = 1.05
        System.out.print("\nGeben Sie die anzahl der Jahre ein: ");
        int jahre = scanner.nextInt();
        for (int i = 0; i < jahre; i++) {
            zwischenergebnis *= zinssatz;
        }
        zwischenergebnis *= 100; // damit die ersten zwei nachkommastellen nicht abgeschnitten werden z.B. 123.4567 * 100 = 12345.67
        zwischenergebnis = Math.round(zwischenergebnis); // rundet die zahl auf die nächste ganze zahl z.B. 12345.67 = 12346
        zwischenergebnis /= 100; // damit die ersten zwei nachkommastellen nicht abgeschnitten werden z.B. 12346 / 100 = 123.46
        kapitalertrag = zwischenergebnis - kapital;
        kapitalertrag *= 100;
        kapitalertrag = Math.round(kapitalertrag);
        kapitalertrag /= 100;
        System.out.println("\n\nStartkapital: " + kapital + "\nKapitalertrag: " + kapitalertrag + "\nEndkapital nach " + jahre + " Jahr/en: " + zwischenergebnis);

        scanner.close();
    }
}
