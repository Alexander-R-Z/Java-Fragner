package Aufgabe3;
import java.util.Scanner;

public class aufgabe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mittelwert;
        System.out.println("Geben sie drei Relle Zahlen ein aus denen der Mittelwert berechnet werden soll:");
        System.out.print("\nZahl 1: ");
        double zahl1 = scanner.nextDouble();
        System.out.print("\nZahl 2: ");
        double zahl2 = scanner.nextDouble();
        System.out.print("\nZahl 3: ");
        double zahl3 = scanner.nextDouble();
        mittelwert = (zahl1 + zahl2 + zahl3) / 3;
        System.out.println("\n\nDer ergebniss ist: " + mittelwert);

        scanner.close();
    }
}
