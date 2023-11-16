package Aufgabe14.geom;

import java.lang.Math;

public class Quader {
    private int length;
    private int width;
    private int height;


    /**
     * Konstrukor
     * 
     * Automaticly called when class gets Created
     */
    public Quader() {
        length = 1;
        width = 1;
        height = 1;
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

    public double getVolume() {
        return length*width*height;
    }


    /**
     * Calculates the lateral surface of the cuboid.
     * @return the lateral surface
     */

    public double getMantelflaeche() {
        return 2*(length*width+width*height);
    }


    /**
     * Calculates the surface area of the cuboid.
     * @return the surface area
     */

    public double getOberflaeche() {
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
