package Aufgabe9_10_11;
import java.util.Scanner;

public class aufgabe9_10_11 {
    public static void main(String[] args) {

        int[] arrayInt = new int[10];

        feldEinlesen(arrayInt);

        int maximum = arrayInt[maximum(arrayInt)];

        feldAusgeben(summe(arrayInt), mittelwert(arrayInt), maximum, maximum(arrayInt));

    }

    public static void feldEinlesen (int... a) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie ein beliebiges 10er Feld uber die Tastatur eingeben. ");
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }

        scanner.close();
    }

    public static int summe(int... a) {
        int summe = 0;
        for (int e : a) {
            summe += e;
        }
        return summe;
    }

    public static double mittelwert(int... a) {
        int summe = 0;
        for (int e : a) {
            summe += e;
        }
        return (double) summe / (double) a.length;
    }

    public static int maximum(int... a) {
        int currentMax = Integer.MIN_VALUE;
        int currentMaxIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > currentMax) {
                currentMax = a[i];
                currentMaxIndex = i;
            }
        }
        return currentMaxIndex;
    }

    public static void feldAusgeben (int summe, double mittelwert, int maximum, int maximumPosition) {

        System.out.println("\n\nDer Mittelwert: " + mittelwert + "\nDie Summe: " + summe + "\nDas grösste Element: " + maximum + " Steht an der stelle Array["+ maximumPosition +"]");

    }
}