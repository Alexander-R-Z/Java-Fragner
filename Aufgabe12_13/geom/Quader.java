package Aufgabe12_13.geom;

import java.lang.Math;

public class Quader {
    int length;
    int width;
    int height;

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
