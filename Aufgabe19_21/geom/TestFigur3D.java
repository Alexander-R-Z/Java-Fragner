package Aufgabe19_21.geom;

public class TestFigur3D {
    public static void main(String[] args) {
        int number = 100;
        Kugel array[] = new Kugel[number]; // erstellt ein array mit dem namen array und der länge nomber
        for (int i = 0; i < array.length; i++) {
            array[i] = new Kugel(Math.random()*100); // erstellt ein objekt vom typ Class und speichert es in das array an der stelle i
        }
        for (e : array) {
            e.method(); // ruft die methode method() des objekts an der stelle e im array auf
        }
    }
}
