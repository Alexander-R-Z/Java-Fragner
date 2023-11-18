package Aufgabe15_16.geom;

import java.lang.Math;

public class Quader {
    private int length, width, height;
    private static int noQuader;


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
    public Quader(int value) {
        this(value, value, value);
    }

    /**
     * Konstrukor (three parameters)
     * 
     * Automaticly called when class gets Created
     */
    public Quader(int length, int width, int height) {
        noQuader++;
        if (length<=0 || width<=0 || height<=0) {
            System.out.println("Error: Der Wert muss grösser als 0 sein!");
            if (length<=0) {
                System.out.println("Länge: "+length);
                this.length = 1;
                System.out.println("Länge wird auf: "+this.length+" gesetzt.");
            }
            if (width<=0) {
                System.out.println("Breite: "+width);
                this.width = 1;
                System.out.println("Breite wird auf: "+this.width+" gesetzt.");
            }
            if (height<=0) {
                System.out.println("Höhe: "+height);
                this.height = 1;
                System.out.println("Höhe wird auf: "+this.height+" gesetzt.");
            }
        } else {
            this.length = length;
            this.width = width;
            this.height = height;
        }
    }

    // get methods...

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static int getNoQuader() {
        return noQuader;
    }

    // set methods...

    public void setLength(int length) {
        if (length>0) {
            this.length = length;
        } else {
            System.out.println("Länge muss grösser als 0 sein!");
        }
    }

    public void setWidth(int width) {
        if (width>0) {
            this.width = width;
        } else {
            System.out.println("Breite muss grösser als 0 sein!");
        }
    }

    public void setHeight(int height) {
        if (height>0) {
            this.height = height;
        } else {
            System.out.println("Höhe muss grösser als 0 sein!");
        }
    }


    /**
     * Calculates the volume of the cuboid.
     * @return the volume
     */

    public int getVolume() {
        return length*width*height;
    }


    /**
     * Calculates the lateral surface of the cuboid.
     * @return the lateral surface
     */

    public int getMantelflaeche() {
        return 2*(length*width+width*height);
    }


    /**
     * Calculates the surface area of the cuboid.
     * @return the surface area
     */

    public int getOberflaeche() {
        return getMantelflaeche()+2*(length*width);
    }


    /**
     * Calculates the space diagonal of the cuboid.
     * @return the space diagonal
     */

    public double getRaumdiagonale() {
        return Math.sqrt(Math.pow((double)length, 2)+Math.pow((double)width, 2)+Math.pow((double)height, 2));
    }
}
