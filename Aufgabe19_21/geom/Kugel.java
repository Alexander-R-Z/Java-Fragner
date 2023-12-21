package Aufgabe19_21.geom;

public class Kugel extends Figur3D {
    private double Radius;
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
        if (Radius <= 0) {
            this.Radius = 1;
            System.out.println("Radius (" + Radius + ") muss grösser als 0 sein!");
            System.out.println("Radius wird auf: " + this.Radius + " gesetzt.");
        } else {
            this.Radius = Radius;
        }
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
     * getRadius
     * 
     * @return The Radius of the Kugel.
     */
    public double getRadius() {
        return Radius;
    }
    
    /**
     * Calculates the volume of the Kugel.
     * @return the volume
     */
    @Override
    public double getVolume() {
        return (4./3.)*Math.PI*Math.pow(Radius, 3);
    }

    /**
     * toString
     * 
     * @return The string representation of the object.
     */
    @Override
    public String toString() {
        return getFigurtyp() + ": " + (4/3) + " x " + Math.PI + " x " + Math.pow(Radius, 3) + " (Volumen: " + getVolume() + ")";
    }
}
