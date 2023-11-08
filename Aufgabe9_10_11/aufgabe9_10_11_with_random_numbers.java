package Aufgabe9_10_11;

public class aufgabe9_10_11_with_random_numbers {
    public static void main(String[] args) {
        int[] arrey = new int[10];
        eingabeArrey(arrey);
        ausgabeArrey(arrey);
    }

    public static void eingabeArrey(int[] a) {
        for (int i = 0; i < a.length; i++) {
            // add a random number (int) betwien 0-100 for each arrey position
            a[i] = (int)(Math.random() * 100);
        }
    }

    public static int summe(int[] a) {
        int summe=0;
        for (int e : a) {
            summe+=e;
        }
        return summe;
    }

    public static double mittelwert(int[] a) {
        return (double) summe(a) / (double) a.length;
    }

    public static int maximum(int[] a) {
        int maximum = 0;
        int maximumID = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maximum) {
                maximum = a[i];
                maximumID = i;
            }
        }
        return maximumID;
    }

    public static String userEndDisplayText(int[] a) {
        return "\n\nDer Mittelwert: " + mittelwert(a) + "\nDie Summe: " + summe(a) + "\nDas grösste Element: " + a[maximum(a)] + " ("+ (maximum(a) + 1) +". "+ a[maximum(a)] +") Steht an der stelle Array["+ maximum(a) +"]";
    }

    public static void ausgabeArrey(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println((i + 1) + ". " + a[i]);
        }
        System.out.println(userEndDisplayText(a));
    }
}
