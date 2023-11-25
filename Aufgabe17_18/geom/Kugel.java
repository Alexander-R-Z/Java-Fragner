package Aufgabe17_18.geom;

public class Kugel extends Figur3D {
    private double Radius;
    private int KugelID;
    private static int noKugel = 0;

    /**
     * Konstrukor (no parameters)
     * 
     * Automaticly called when class gets Created
     */
    public Kugel() {
        this(1);
    }

    /**
     * Konstrukor (one parameters)
     * 
     * Automaticly called when class gets Created
     */
    public Kugel(double Radius) {
        super(Figurtypen.Kugel);
        noKugel++;
        KugelID = noKugel;
        if (Radius <= 0) {
            this.Radius = 1;
            System.out.println("Höhe (" + Radius + ") muss grösser als 0 sein!");
            System.out.println("Höhe wird auf: " + this.Radius + " gesetzt.");
        } else {
            this.Radius = Radius;
        }
    }

    /**
     * getKugelID
     * 
     * @return The ID of the 3D figure.
     */
    public int getKugelID() {
        return KugelID;
    }

    /**
     * getNoKugel
     * 
     * @return The number of 3D figures created.
     */
    public static int getNoKugel() {
        return noKugel;
    }

    /**
     * Calculates the volume of the Kugel.
     * @return the volume
     */
    @Override
    public double getVolume() {
        return (4/3)*Math.PI*Math.pow(Radius, 2);
    }
}
