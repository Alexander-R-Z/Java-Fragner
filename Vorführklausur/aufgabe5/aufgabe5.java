package Vorführklausur.aufgabe5;

public class aufgabe5 {
    public static void main(String[] args) {
        double x = 5; // eine zufällige Zahl
        double sum = 0, term = 1;
        for(int n = 1; n <= 999; n++) {
            term *= x / n;
            sum += term;
        }
        System.out.println("Sum: " + sum);
    }
}