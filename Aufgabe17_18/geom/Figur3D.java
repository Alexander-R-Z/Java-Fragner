package Aufgabe17_18.geom;

public class Figur3D {
    /**
     * noFigur3D is used to store the number of 3D figures created.
     */
    private static int noFigur3D = 0;

    /**
     * ID is used to store the ID of the 3D figure.
     */
    private int ID;

    /**
     * enum Figurtypen is used to store the different types of 3D figures.
     * 
     * stored values:
     * 
     * @param Kugel The Kugel figure type.
     * @param Pyramide The Pyramide figure type.
     * @param Quader The Quader figure type.
     */
    public enum Figurtypen {
        Kugel,
        Pyramide,
        Quader
    }

    /**
     * Figurtypen figurtyp is used to set the type of the 3D figure.
     * 
     * possible values:
     * 
     * @param Kugel The Kugel figure type.
     * @param Pyramide The Pyramide figure type.
     * @param Quader The Quader figure type.
     */
    private Figurtypen figurtyp;

    /**
     * Figur3D constructor
     * 
     * @param figurtyp The type of the 3D figure.
     * @param ID The ID of the 3D figure.
     */
    public Figur3D(Figurtypen figurtyp) {
        noFigur3D++;
        this.figurtyp = figurtyp;
        this.ID = noFigur3D;
        System.out.println( figurtyp + "-Objekt wurde mit ID " + this.ID + " erzeugt.");
    }

    /**
     * getNoFigur3D
     * 
     * @return The number of 3D figures created.
     */
    public static int getNoFigur3D() {
        return noFigur3D;
    }

    /**
     * getID
     * 
     * @return The ID of the 3D figure.
     */
    public int getID() {
        return ID;
    }

    /**
     * getFigurtyp
     * 
     * @return The type of the 3D figure.
     */
    public Figurtypen getFigurtyp() {
        return figurtyp;
    }

    /**
     * getVolume
     * 
     * @return The volume of the 3D figure. (default: 0.0)
     */
    public double getVolume() {
        return 0.0;
    }
}
