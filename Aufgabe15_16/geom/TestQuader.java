package Aufgabe15_16.geom;

/**
 * The main method is the entry point of the program.
 * It creates multiple instances of the Quader class, calculates their volumes,
 * and handles any IllegalArgumentExceptions that may occur.
 * It also prints the number of objects created and the error indices, if any.
 *
 * @param args The command-line arguments passed to the program.
 */
public class TestQuader {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            new Quader();
        }
        System.out.println("\nAnonymis instances of the Quader class Created\nNumber of objects: " + Quader.getNoQuader() + "\n");

        testQuader(1, 1, 1, 1);
    }

    /**
     * Quader constructor test
     *
     * @param i The length, width and height of the Quader.
     * @param a The length of the Quader.
     * @param b The width of the Quader.
     * @param c The height of the Quader.
     */
    public static void testQuader(int i, int a, int b, int c) {
        if (QuaderConstructor()) {
            System.out.println("Quader constructor test (no parameters): OK");
        } else {
            System.out.println("Quader constructor test (no parameters): ERROR");
        }
        if (QuaderConstructorOne(i)) {
            System.out.println("Quader constructor test (one parameter): OK");
        } else {
            System.out.println("Quader constructor test (one parameter): ERROR");
        }
        if (QuaderConstructorThree(a, b, c)) {
            System.out.println("Quader constructor test (three parameters): OK");
        } else {
            System.out.println("Quader constructor test (three parameters): ERROR");
        }
    }

    /**
     * Quader constructor test (no parameters)
     *
     * @param none Tests the Quader constructor with no parameters.
     * 
     * @return True if the Quader constructor with no parameters works correctly.
     *       False if the Quader constructor with no parameters does not work correctly.
     */
    public static boolean QuaderConstructor() {
        Quader q = new Quader();
        if (q.getVolume() == 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Quader constructor test (one parameter)
     *
     * @param a The length, width and height of the Quader.
     * 
     * @return True if the Quader constructor with one parameter works correctly.
     *        False if the Quader constructor with one parameter does not work correctly.
     */
    public static boolean QuaderConstructorOne(int a) {
        Quader q = new Quader(a);
        if (q.getVolume() == 1 || q.getVolume() == a * a * a && q.getVolume() >= 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Quader constructor test (three parameters)
     *
     * @param a The length of the Quader.
     * @param b The width of the Quader.
     * @param c The height of the Quader.
     * 
     * @return True if the Quader constructor with three parameters works correctly.
     *       False if the Quader constructor with three parameters does not work correctly.
     */
    public static boolean QuaderConstructorThree(int a , int b, int c) {
        Quader q = new Quader(a, b, c);
        if (q.getVolume() == 1 || q.getVolume() == a * b * c && q.getVolume() >= 1) {
            return true;
        } else {
            return false;
        }
    }
}
