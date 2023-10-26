//package code; // Package: code (Ordner: code) // (Pfad von Projektordner (Java-Fragner) aus: code/datentypen.java)
public class datentypen { // Klasse: Datentypen (Datei: Datentypen.java)
    public static void main (String[] args) { // Methode: main (Einstiegspunkt des Programms)
        
        // Datentypen
        // byte, short, int, long, float, double, boolean, char

        byte b = 127; // byte: 8 bit, -128 bis 127
        short s = 32767; // short: 16 bit, -32768 bis 32767
        int i = 2147483647; // int: 32 bit, -2147483648 bis 2147483647
        long l = 9223372036854775807L; // long: 64 bit, -9223372036854775808 bis 9223372036854775807
        float f = 3.4028235E38F; // float: 32 bit, 1.4E-45 bis 3.4028235E38
        double d = 1.7976931348623157E308; // double: 64 bit, 4.9E-324 bis 1.7976931348623157E308
        boolean bool = true; // boolean: true oder false
        char c = 65535; // char: 16 bit, 0 bis 65535

        System.out.println("byte: "+b); // System.out.println("byte: "+b); Bedeutet: Gib den Text "byte: " aus, dann gib den Wert von b aus und gehe in die nächste Zeile
        System.out.println("short: "+s);
        System.out.println("int: "+i);
        System.out.println("long: "+l);
        System.out.println("float: "+f);
        System.out.println("double: "+d);
        System.out.println("boolean: "+bool);
        System.out.println("char: "+c);

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
    }
}
