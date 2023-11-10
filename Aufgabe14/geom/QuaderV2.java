package Aufgabe14.geom;

import java.lang.Math;

class QuaderV2 {
    private int length;
    private int width;
    private int height;


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

    public void setLength(int a) {
        if (a>0) {
            length = a;
        } else {
            System.out.println("Länge muss grösser als 0 sein!");
        }
    }

    public void setWidth(int a) {
        if (a>0) {
            width = a;
        } else {
            System.out.println("Breite muss grösser als 0 sein!");
        }
    }

    public void setHeight(int a) {
        if (a>0) {
            height = a;
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
