package Aufgabe15_16.geom;

/**
 * The main method is the entry point of the program.
 * It creates multiple instances of the Quader class, calculates their volumes,
 * and handles any IllegalArgumentExceptions that may occur.
 * It also prints the number of objects created and the error indices, if any.
 *
 * @param args The command-line arguments passed to the program.
 */
public class TestQuaderV2 {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            new Quader();
        }
        System.out.println("Number of objects: " + Quader.getNoQuader());

        QuaderConstructor();
        QuaderConstructorOne(100);
        QuaderConstructorThree(100);
    }

    /**
     * Quader constructor test (no parameters)
     *
     * Tests the Quader constructor with no parameters.
     */
    public static void QuaderConstructor() {
        Quader q = new Quader();
    }

    /**
     * Quader constructor test (one parameter)
     *
     * @param i The number of iterations for testing the Quader constructor with one parameter.
     */
    public static void QuaderConstructorOne(int i) {
        for (int j = 0; j < i; j++) {
            int a = (int) (Math.random() * 100) + 1;
            Quader q = new Quader(a);
        }
    }

    /**
     * Quader constructor test (three parameters)
     *
     * @param i The number of iterations for testing the Quader constructor with three parameters.
     */
    public static void QuaderConstructorThree(int i) {
        for (int j = 0; j < i; j++) {
            int a = (int) (Math.random() * 100) + 1;
            int b = (int) (Math.random() * 100) + 1;
            int c = (int) (Math.random() * 100) + 1;
            Quader q = new Quader(a, b, c);
        }
    }
}
