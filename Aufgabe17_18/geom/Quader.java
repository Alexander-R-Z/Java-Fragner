package Aufgabe17_18.geom;

public class Quader extends Figur3D {
    private double length, width, height;
    private int QuaderID;
    private static int noQuader = 0;

    /**
     * Konstrukor (no parameters)
     * 
     * Automaticly called when class gets Created
     */
    public Quader() {
        this(1);
    }

    /**
     * Konstrukor (one parameters)
     * 
     * Automaticly called when class gets Created
     */
    public Quader(double value) {
        this(value, value, value);
    }

    /**
     * Konstrukor (three parameters)
     * 
     * Automaticly called when class gets Created
     */
    public Quader(double length, double width, double height) {
        super(Figurtypen.Quader);
        noQuader++;
        QuaderID = noQuader;
        if (length<=0 || width<=0 || height<=0) {
            System.out.println("Error: Der Wert muss grösser als 0 sein!");
            if (length<=0) {
                this.length = 1;
                System.out.println("Länge ("+length+") muss grösser als 0 sein!");
                System.out.println("Länge wird auf: "+this.length+" gesetzt.");
            }
            if (width<=0) {
                this.width = 1;
                System.out.println("Breite ("+width+") muss grösser als 0 sein!");
                System.out.println("Breite wird auf: "+this.width+" gesetzt.");
            }
            if (height<=0) {
                this.height = 1;
                System.out.println("Höhe ("+height+") muss grösser als 0 sein!");
                System.out.println("Höhe wird auf: "+this.height+" gesetzt.");
            }
        } else {
            this.length = length;
            this.width = width;
            this.height = height;
        }
    }

    /**
     * getQuaderID
     * 
     * @return The ID of the 3D figure.
     */
    public int getQuaderID() {
        return QuaderID;
    }

    /**
     * getNoQuader
     * 
     * @return The number of 3D figures created.
     */
    public static int getNoQuader() {
        return noQuader;
    }

    /**
     * Calculates the volume of the Quader.
     * @return the volume
     */
    @Override
     public double getVolume() {
        return length*width*height;
    }
}
