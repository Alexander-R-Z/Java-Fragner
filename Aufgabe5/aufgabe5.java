package Aufgabe5;

public class aufgabe5 {
    public static void main(String[] args) {
        char unicodeZeichen;
        for (int i = 48; i <= 57; i++) {
            unicodeZeichen = (char) i;
            System.out.println(unicodeZeichen + " = U+" + i);
        }
    }
}
