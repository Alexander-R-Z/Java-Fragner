package Aufgabe6;
import java.util.Scanner;

public class aufgabe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine ganze Zahl ein: ");
        int zahl = scanner.nextInt();
        System.out.println("Die Zahl lautet: " + zahl);
        while (zahl < 100) {
            zahl+=10;
            System.out.println(zahl);
        }
        scanner.close();
    }
    
}
