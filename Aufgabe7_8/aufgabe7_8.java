package Aufgabe7_8;
import java.util.Scanner;
import java.lang.Math;
public class aufgabe7_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = Math.cos(a);
        System.out.println(b);


        scanner.close();
    }
}
