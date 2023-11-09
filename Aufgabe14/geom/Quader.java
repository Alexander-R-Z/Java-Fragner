package Aufgabe14.geom;

import java.lang.Math;

public class Quader {
    private int length;
    private int width;
    private int height;

    public int getLength() { // when it gets called, it returns length
        return length; // return is used to return a value from a method (length is private, so it can only be accessed through getLength())
    }

    public void setLength(int length) {
        if (length>0) {
            this.length = length; // this.length = length; wird verwendet, um das length-Feld des Quader-Objekts auf den Wert des length-Parameter der Methode zu setzen.
        } else {
            System.out.println("Länge muss grösser als 0 sein!");
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width>0) {
            this.width = width;
        } else {
            System.out.println("Breite muss grösser als 0 sein!");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height>0) {
            this.height = height;
        } else {
            System.out.println("Höhe muss grösser als 0 sein!");
        }
    }

    double getVolume() {
        return length*width*height;
    }

    double getMantelflaeche() {
        return 2*(length*width+width*height);
    }

    double getOberflaeche() {
        return getMantelflaeche()+2*(length*width);
    }

    double getRaumdiagonale() {
        return Math.sqrt(Math.pow((double)length, 2)+Math.pow((double)width, 2)+Math.pow((double)height, 2));
    }
}
