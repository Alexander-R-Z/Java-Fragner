//package code; // Package: code (Ordner: code) // (Pfad von Projektordner (Java-Fragner) aus: code/datentypen.java)
public class datentypen { // Klasse: Datentypen (Datei: Datentypen.java)
    public static void main (String[] args) { // Methode: main (Einstiegspunkt des Programms)
        
        // Datentypen
        // byte, short, int, long, float, double, boolean, char

        byte b = 127; // byte: 8 bit, -128 bis 127
        short s = 32767; // short: 16 bit, -32768 bis 32767
        int n = 2147483647; // int: 32 bit, -2147483648 bis 2147483647
        long l = 9223372036854775807L; // long: 64 bit, -9223372036854775808 bis 9223372036854775807
        float f = 3.4028235E38F; // float: 32 bit, 1.4E-45 bis 3.4028235E38
        double d = 1.7976931348623157E308; // double: 64 bit, 4.9E-324 bis 1.7976931348623157E308
        boolean bool = true; // boolean: true oder false
        char c = 65535; // char: 16 bit, 0 bis 65535

        System.out.println("byte: "+b); // System.out.println("byte: "+b); Bedeutet: Gib den Text "byte: " aus, dann gib den Wert von b aus und gehe in die nächste Zeile
        System.out.println("short: "+s);
        System.out.println("int: "+n);
        System.out.println("long: "+l);
        System.out.println("float: "+f);
        System.out.println("double: "+d);
        System.out.println("boolean: "+bool);
        System.out.println("char: "+c);

        // variable = -1
        // variable>>>30;

        // convert

        float f2 = 3.4028235E38F; // float: 32 bit, 1.4E-45 bis 3.4028235E38
        int i2 = (int) f2; // converts float to int
        double d2 = 1.7976931348623157E308; // double: 64 bit, 4.9E-324 bis 1.7976931348623157E308
        i2 = (int) d2; // converts double to int
        char c2 = (char) i2; // converts int to char

        // array

        int beispielArray[] = new int[10]; // int beispielArray = new int[10]; Bedeutet: Erstelle ein Array mit dem Namen beispielArray, welches 10 Elemente bekommen soll
        int beispielArray2[] = {1,2,3,4,5,6,7,8,9,10}; // int beispielArray2 = {1,2,3,4,5,6,7,8,9,10}; Bedeutet: Erstelle ein Array mit dem Namen beispielArray2, welches 10 Elemente hat und die Werte 1 bis 10 hat
        int beispielArray3[]; // int beispielArray3; Bedeutet: Erstelle ein Array(reverrenz variabel) mit dem Namen beispielArray3
        beispielArray3 = new int[10]; // beispielArray3 = new int[10]; Bedeutet: Erstelle ein Array mit dem Namen beispielArray3, welches 10 Elemente bekommen soll
        int[] array = {1,2,3,4,5,6,7,8,9,10}; // int[] array = {1,2,3,4,5,6,7,8,9,10}; Bedeutet: Erstelle ein Array mit dem Namen array, welches 10 Elemente hat und die Werte 1 bis 10 hat

        System.out.println("array" + array[0]); // System.out.println("array" + array[0]); Bedeutet: Gib den Text "array" aus, dann gib den Wert von array[0] aus und gehe in die nächste Zeile (array[0] = 1)


        int arrayName[] = new int[5]; // ein array in das man 5 int werte speichern kann
        arrayName[0] = 1;
        arrayName[1] = 2;
        arrayName[2] = 3;
        arrayName[3] = 4;
        arrayName[4] = 5;
        int meineZahlen[] = {1,2,3,4,5}; // ein array in das ich 5 werte speicher
        System.out.println(meineZahlen[0]);
        String meineZahlen2[]; // eine array reverrenz variable (nur der name wird gesetzt) (alles andere muss später definirt werden)
        meineZahlen2 = new String[2]; // hier wird das array erst richtig erzeugt (man kann 2 int werte speichern)
        meineZahlen2[0] = "test";
        String username = "max mustermann";
        meineZahlen2[1] = username;


        // String (Zeichenkette) (String ist ein Objekt aber verhält sich wie ein Datentyp)

        String text1 = "test";
        String text2 = "test";
        if (text1 == text2) { // == vergleicht ob die beiden variablen gleich sind
            System.out.println("text1 und text2 sind gleich");
        } else if (text1.equals(text2)) {
            System.out.println("text1 und text2 sind gleich (equals)");
        } else {
            System.out.println("text1 und text2 sind nicht gleich");
        }

        for (int i = 0; i < text1.length(); i++) { // text1.length() gibt die länge des strings zurück
            System.out.println(text1.charAt(i)); // text1.charAt(i) gibt den char an der stelle i zurück
        }

        StringBuffer TempText = new StringBuffer(); // erstellt ein StringBuffer objekt mit dem namen TempText und

        TempText.append("test"); // TempText.append("test"); fügt den text "test" an den string an


        // Vergleich von Objekten

        // if (object1.vergleicht(object2)) {
        //     System.out.println("object1 und object2 sind gleich");
        // } else {
        //     System.out.println("object1 und object2 sind nicht gleich");
        // }

        // public class object1 extends object2 { // object1 erbt von object2
            // super(); // ruft den konstruktor von object2 auf
            // super(parameter, parameter2, parameter3); // ruft den konstruktor von object2 auf und übergibt die parameter

        try {
            // code der fehler verursachen könnte (meist user input)
        } catch (Exception e) {
            // code der ausgeführt wird wenn ein fehler auftritt
            // e ist ein objekt vom typ Exception und enthält informationen über den fehler
        }

        // int number = 10;
        // Class array[] = new Class[number]; // erstellt ein array mit dem namen array und der länge nomber
        // for (int i = 0; i < number; i++) {
        //     array[i] = new Class(); // erstellt ein objekt vom typ Class und speichert es in das array an der stelle i
        // }
        // array[0].method(); // ruft die methode method() des objekts an der stelle 0 im array auf

        // Class ParrentClass {
        //     public void method() {
        //         System.out.println("method");
        //     }
        // }

        // Class ChildClass extends ParrentClass {
        //     @Override // gibt an das die methode überschrieben wird
        //     public void method() {
        //         System.out.println("Overrided method");
        //     }

        //     public PerrentClassMethod() { // name does not matter
        //         super.method(); // ruft die methode method() der superclass auf
        //     }
        // }

        // public abstract class ClassName {
        //     public abstract void method(); // abstract methoden haben keinen code und müssen in der child class überschrieben werden
        // }

    }
}
