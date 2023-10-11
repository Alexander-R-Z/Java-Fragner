package Aufgabe2;
import java.util.Scanner;

public class aufgabe2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ergebniss;
        
        System.out.println("Das Programm wird 2 ganze Zahlen addiren und ausgeben.\n\n");
        System.out.print("Geben sie die erste Zahl ein: ");
        int zahl1 = scanner.nextInt();
        System.out.print("\nGeben sie die zweite Zahl ein: " + zahl1 + " + ");
        int zhal2 = scanner.nextInt();
        ergebniss = zahl1 + zhal2;
        System.out.println("\n\nDas ergebniss ist: " + ergebniss + "\n");

    }
}