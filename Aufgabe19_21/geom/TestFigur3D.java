package Aufgabe19_21.geom;

public class TestFigur3D {
    public static void main(String[] args) {
        int number = 100;
        Kugel array[] = new Kugel[number]; // erstellt ein array mit dem namen array und der länge nomber
        for (int i = 0; i < array.length; i++) {
            array[i] = new Kugel((int) Math.random()*100); // erstellt ein objekt vom typ Class und speichert es in das array an der stelle i
        }
        int MaxIndex = maximum(array);
        userOutput(array, MaxIndex);
    }

    public static int maximum(Kugel[] a) {
        int currentMax = Integer.MIN_VALUE;
        int currentMaxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if ((int) a[i].getRadius() > currentMax) {
                currentMax = (int) a[i].getRadius();
                currentMaxIndex = i;
            }
        }
        return currentMaxIndex;
    }

    public static void userOutput(Kugel[] a, int MaxIndex) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].getRadius() == a[MaxIndex].getRadius()) {
                count++;
                System.out.print("ID " + a[i].getID() + ", ");
            }
        }
        System.out.println("(" + count + ") Kugeln mit dem Radius " + (int) a[MaxIndex].getRadius() + " gefunden.");
    }
}
