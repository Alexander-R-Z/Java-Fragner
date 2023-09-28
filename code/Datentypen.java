package code; // Package: code (Ordner: code) // (Pfad von Projektordner (Java-Fragner) aus: code/datentypen.java)
public class Datentypen { // Klasse: Datentypen (Datei: Datentypen.java)
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

        System.out.println("byte: "+b);
        System.out.println("short: "+s);
        System.out.println("int: "+i);
        System.out.println("long: "+l);
        System.out.println("float: "+f);
        System.out.println("double: "+d);
        System.out.println("boolean: "+bool);
        System.out.println("char: "+c);

    }
}
