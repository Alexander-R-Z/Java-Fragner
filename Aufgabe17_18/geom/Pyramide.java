package Aufgabe17_18.geom;

public class Pyramide extends Figur3D {
    private double length, width, height;
    private static int noPyramide = 0;

    /**
     * Konstrukor (no parameters)
     * 
     * Automaticly called when class gets Created
     */
    public Pyramide() {
        this(1);
    }

    /**
     * Konstrukor (one parameters)
     * 
     * Automaticly called when class gets Created
     */
    public Pyramide(double value) {
        this(value, value, value);
    }

    /**
     * Konstrukor (three parameters)
     * 
     * Automaticly called when class gets Created
     */
    public Pyramide(double length, double width, double height) {
        super(Figurtypen.Pyramide);
        noPyramide++;
        if (length<=0 || width<=0 || height<=0) {
            System.out.println("Error: Der Wert muss grösser als 0 sein!");
            if (length<=0) {
                System.out.println("Länge ("+length+") muss grösser als 0 sein!");
                length = 1;
                System.out.println("Länge wird auf: "+length+" gesetzt.");
            }
            if (width<=0) {
                System.out.println("Breite ("+width+") muss grösser als 0 sein!");
                width = 1;
                System.out.println("Breite wird auf: "+width+" gesetzt.");
            }
            if (height<=0) {
                System.out.println("Höhe ("+height+") muss grösser als 0 sein!");
                height = 1;
                System.out.println("Höhe wird auf: "+height+" gesetzt.");
            }
        }
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * getNoPyramide
     * 
     * @return The number of 3D figures created.
     */
    public static int getNoPyramide() {
        return noPyramide;
    }

    /**
     * Calculates the volume of the Pyramide.
     * @return the volume
     */
    @Override
    public double getVolume() {
        return (length*width*height)/3;
    }
}
