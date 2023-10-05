package Aufgabe1;

public class aufgabe1 {
    public static void main(String[] args) {
        // d) 1
        String name = "Alexander";
        String lastname = "Zimmermann";
        String fullname = name + " " + lastname;
        String email = name + "." + lastname + "@stud.hs-hannover.de";
        String studienrichtung = "MAT";
        System.out.println("Name: " + fullname + "\nEmail: " + email + "\nStudienrichtung: " + studienrichtung);

        // d) 2.1
        int a = 3, b = 6, c;
        c = a + b;
        System.out.println("\n\na = " + a + "\nb = " + b + "\na + b = " + c);

        // d) 2.2
        byte d = 127, e = 10, f;
        f = (byte) (d + e);
        System.out.println("d = " + d + "\ne = " + e + "\nd + e = " + f + "\nHier gibt es einen Überlauf, da 127 + 10 = 227 ist, was nicht in einem Byte gespeichert werden kann.");
        
        // d) 3.1
        double kapital = 180;
        double zwischenergebnis = kapital;
        double kapitalertrag = 0;
        double zinssatz = 1.02;
        int jahre = 1;
        for (int i = 0; i < jahre; i++) {
            zwischenergebnis *= zinssatz;
        }
        kapitalertrag = zwischenergebnis - kapital;
        System.out.println("\n\nStartkapital: " + kapital + "\nKapitalertrag: " + kapitalertrag + "\nEndkapital nach " + jahre + " Jahr/en: " + zwischenergebnis);

        // d) 3.2 (Rechen Fehler durch Datentypen)
        int kapital2 = 180;
        int zwischenergebnis2 = kapital2;
        int kapitalertrag2 = 0;
        double zinssatz2 = 1.02;
        int jahre2 = 1;
        for (int i = 0; i < jahre2; i++) {
            zwischenergebnis2 *= zinssatz2;
        }
        kapitalertrag2 = zwischenergebnis2 - kapital2;
        System.out.println("\n\nRechen Fehler durch Datentypen:\nStartkapital: " + kapital2 + "\nKapitalertrag: " + kapitalertrag2 + "\nEndkapital nach " + jahre2 + " Jahr/en: " + zwischenergebnis2);

        // d) 4 (die anzahl 24 durch Bit-Operatoten vierteln)
        int zahl = 24;
        int zahl2 = zahl >> 2;
        System.out.println("\n\nzahl = " + zahl + "\nzahl >> 2 = " + zahl2);
    }
}