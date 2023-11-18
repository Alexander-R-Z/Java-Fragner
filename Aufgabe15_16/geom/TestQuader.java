package Aufgabe15_16.geom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestQuader {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            new Quader();
        }
        System.out.println("Number of objects: " + Quader.getNoQuader());

        Scanner sc = new Scanner(System.in);

        char exit;

        int input = 0;

        do {

            do {
                System.out.println("\nWelchen Fall wollen Sie testen? (1, 2, 3)?");
                try {
                    input = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("\nFehlerhafte Eingabe. Bitte wiederholen Sie die Eingabe.");
                    sc.nextLine(); // consume the invalid input
                }
            } while (input < 1 || input > 3);

            int[] a = new int[3];

            switch (input) {
                case 1:
                Quader q1 = new Quader();
                System.out.println(q1.getVolume());
                    break;
            
                case 2:
                System.out.println("Geben Sie die Seiten Länge ein.");
                for (int i = 0; i < 1; i++) {
                    try {
                        a[i] = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Fehlerhafte Eingabe. Bitte wiederholen Sie die Eingabe.");
                        sc.nextLine(); // consume the invalid input
                        i--;
                    }
                }
                Quader q2 = new Quader(a[0]);
                System.out.println(q2.getVolume());
                    break;
            
                case 3:
                System.out.println("Geben Sie Länge, Breite und Höhe ein.");
                for (int i = 0; i < 3; i++) {
                    try {
                        System.out.print("Geben Sie die " + (i + 1) + ". Zahl ein: ");
                        a[i] = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Fehlerhafte Eingabe. Bitte wiederholen Sie die Eingabe.");
                        sc.nextLine(); // consume the invalid input
                        i--;
                    }
                }
                Quader q3 = new Quader(a[0], a[1], a[2]);
                System.out.println(q3.getVolume());
                    break;
            
                default:
                    break;
            }
            System.out.println("Wollen Sie noch einen Fall testen? (y/n)");
            exit = sc.next().charAt(0); // Read user input
        } while (exit == 'y' || exit == 'Y' || exit == 'j' || exit == 'J');
        sc.close();
    }
}
