package Aufgabe12_13.geom;

public class TestQuader {
    public static void main(String[] args) {

        Quader quader1 = new Quader();

        quader1.length = (int)(Math.random()*100);
        quader1.width = (int)(Math.random()*100);
        quader1.height = (int)(Math.random()*100);

        System.out.println("Quader 1\nLänge: " + quader1.length + "\nBreite: " + quader1.width + "\nHöhe: " + quader1.height);

        System.out.println("\nQuader 1\nVolume: " + quader1.getVolume() + "\nMantelfläche: " + quader1.getMantelflaeche() + "\nOberfläche: " + quader1.getOberflaeche() + "\nRaumdiagonale: " + quader1.getRaumdiagonale());

        Quader quader2 = new Quader();

        quader2.length = (int)(Math.random()*100);
        quader2.width = (int)(Math.random()*100);
        quader2.height = (int)(Math.random()*100);

        System.out.println("\nQuader 2\nLänge: " + quader2.length + "\nBreite: " + quader2.width + "\nHöhe: " + quader2.height);

        System.out.println("\nQuader 2\nVolume: " + quader2.getVolume() + "\nMantelfläche: " + quader2.getMantelflaeche() + "\nOberfläche: " + quader2.getOberflaeche() + "\nRaumdiagonale: " + quader2.getRaumdiagonale());

        if (quader1.getVolume()>quader2.getVolume()) {
            System.out.println("\nQuader 1 (" + quader1.getVolume() + ") ist gröser als Quader 2 (" + quader2.getVolume() + ")");
        } else if (quader1.getVolume()<quader2.getVolume()) {
            System.out.println("\nQuader 2 (" + quader2.getVolume() + ") ist gröser als Quader 1 (" + quader1.getVolume() + ")");
        } else {
            System.out.println("\nQuader 1 und Quader 2 sind Gleichgros (" + quader1 + " = " + quader2 + ")");
        }
    }
}
