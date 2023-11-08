package Aufgabe12_13.geom;

import java.lang.Math;

public class Quader {
    double length;
    double width;
    double height;

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
        return Math.sqrt(Math.pow(length, 3)+Math.pow(width, 3)+Math.pow(height, 3));
    }
}
