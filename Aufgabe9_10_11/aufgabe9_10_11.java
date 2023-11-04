package Aufgabe9_10_11;
import java.util.Scanner;

public class aufgabe9_10_11 {
    public static void main(String[] args) {

        int[] arrayInt = new int[10];

        feldEinlesen(arrayInt);

        feldAusgeben(arrayInt);

    }

    public static void feldEinlesen (int... a) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie ein beliebiges 10er Feld uber die Tastatur eingeben. ");
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }

        scanner.close();
    }

    public static void feldAusgeben (int... a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print("\n"+(i+1)+". "+a[i]);
        }

        int arrayGroese=0;
        int arraySumme=0;
        for (int e : a) {
            arrayGroese = a.length + 1;
            arraySumme += e;
        }
        double mittelwert = (double) arraySumme / (double) arrayGroese;

        int currentMax = Integer.MIN_VALUE;
        for (int e : a) {
            if (e>currentMax) currentMax = e;
        }
        
        int currentMaxPosition = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==currentMax) currentMaxPosition = i;
        }

        System.out.println("\n\nDer Mittelwert: " + mittelwert + "\nDie Summe: " + arraySumme + "\nDas grösste Element: " + currentMax + " Steht an der stelle Array["+ currentMaxPosition +"]");

    }
}