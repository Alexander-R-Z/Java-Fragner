package Aufgabe12_13.geom;

import java.lang.Math; // import is used to import a package (Math is a package) Math has useful methods like Math.pow() and Math.sqrt()

public class Quader {
    int length;
    int width;
    int height;

    double getVolume() { // when it gets called, it returns the value of length*width*height
        return length*width*height; // return is used to return a value from a method
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
