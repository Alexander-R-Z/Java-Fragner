package Aufgabe14.geom;

public class TestQuader {
    public static void main(String[] args) {

        Quader quader1 = new Quader(); // new Quader() creates a new Quader object and returns a reference to it (quader1) which is stored in the variable quader1

        // (int)(Math.random()*100) returns a random number between 0 and 100
        quader1.setLength((int)(Math.random()*100));
        quader1.setWidth((int)(Math.random()*100));
        quader1.setHeight((int)(Math.random()*100));

        System.out.println("\nQuader 1\nLänge: " + quader1.getLength() + "\nBreite: " + quader1.getWidth() + "\nHöhe: " + quader1.getHeight());

        System.out.println("\nQuader 1\nVolume: " + quader1.getVolume() + "\nMantelfläche: " + quader1.getMantelflaeche() + "\nOberfläche: " + quader1.getOberflaeche() + "\nRaumdiagonale: " + quader1.getRaumdiagonale());

        Quader quader2 = new Quader();

        quader2.setLength((int)(Math.random()*100));
        quader2.setWidth((int)(Math.random()*100));
        quader2.setHeight((int)(Math.random()*100));

        System.out.println("\nQuader 2\nLänge: " + quader2.getLength() + "\nBreite: " + quader2.getWidth() + "\nHöhe: " + quader2.getHeight());

        System.out.println("\nQuader 2\nVolume: " + quader2.getVolume() + "\nMantelfläche: " + quader2.getMantelflaeche() + "\nOberfläche: " + quader2.getOberflaeche() + "\nRaumdiagonale: " + quader2.getRaumdiagonale());

        if (quader1.getVolume()>quader2.getVolume()) {
            System.out.println("\nQuader 1 (" + quader1.getVolume() + ") ist gröser als Quader 2 (" + quader2.getVolume() + ")\n");
        } else if (quader1.getVolume()<quader2.getVolume()) {
            System.out.println("\nQuader 2 (" + quader2.getVolume() + ") ist gröser als Quader 1 (" + quader1.getVolume() + ")\n");
        } else {
            System.out.println("\nQuader 1 und Quader 2 sind Gleichgros (" + quader1.getVolume() + " = " + quader2.getVolume() + ")\n");
        }
    }
}
