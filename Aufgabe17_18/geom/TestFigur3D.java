package Aufgabe17_18.geom;

public class TestFigur3D {
    public static void main(String[] args) {
        Quader q1 = new Quader(2, 2, 2);
        Pyramide p1 = new Pyramide(2, 2, 2);
        Kugel k1 = new Kugel(2);

        System.out.println("Anzahl Figuren: " + Figur3D.getNoFigur3D());
    }
}
