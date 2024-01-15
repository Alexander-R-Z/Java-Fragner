import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Formelsammlung {
}
public static void main(String[] args) { // kann mit "psvm" abgekürzt werden
}
// In the starting class, all methods must be static

// Print "Hello World"
System.out.println("Hello World");

// Print the value of the variable "name"
String name = "John";
System.out.println(name);

// Datentypen
// byte, short, int, long, float, double, boolean, char

// Variable declaration and initialization
byte myByte = 10; // Lowest value: -128, Highest value: 127
short myShort = 100; // Lowest value: -32768, Highest value: 32767
int myInt = 1000; // Lowest value: -2147483648, Highest value: 2147483647
long myLong = 10000L; // Lowest value: -9223372036854775808, Highest value: 9223372036854775807
float myFloat = 3.14f; // Lowest value: 1.4E-45, Highest value: 3.4028235E38
double myDouble = 3.14159; // Lowest value: 4.9E-324, Highest value: 1.7976931348623157E308
boolean myBoolean = true; // Value: true or false
char myChar = 'A'; // Value: any Unicode character
String myString = "Hello World"; // Value: any text

int x = 5, y = 6, z = 50; // Declare more than one variable of the same type

// Convert data types
int myInt2 = (int) myFloat; // Convert float to int (always round down)
int myInt3 = (int) myDouble; // Convert double to int (always round down)
char myChar2 = (char) myInt2; // Convert int to char

// Scanner
Scanner scanner = new Scanner(System.in); // Create a Scanner object
int zahl1 = scanner.nextInt(); // Read user input as int
double kapital = scanner.nextDouble(); // Read user input as double
scanner.close(); // Close the Scanner object

// char
for (int i = 48; i <= 57; i++) { // ASCII 48-57 = 0-9
    System.out.println((char) i + " = U+" + i); // Print the Unicode character
}







// loops
if (/* condition */) {
    // code block to be executed if the condition is true
} else {
    // code block to be executed if the condition is false 
}

switch (/* expression */) {
    case /* value */:
        // code block
        break;
    case /* value */:
        // code block
        break;
    default:
        // code block
}

for (/* initialization */; /* condition */; /* increment */) {
    // code block to be executed
}

// loop for as long as the array is long
public static void eingabeArrey(int[] a) {
    for (int i = 0; i < a.length; i++) {
        // add a random number (int) betwien 0-100 for each arrey position
        a[i] = (int)(Math.random() * 100);
    }
}

// array for-each loop
public static int summe(int[] a) {
    int summe=0;
    for (int e : a) {
        summe+=e;
    }
    return summe;
}

while (/* condition */) {
    // code block to be executed
}

do { // always executes the code block at least once
    // code block to be executed
} while (/* condition */);

// arrays
int[] myArray = {1, 2, 3, 4, 5}; // Create an array and add values
int[] myArray2 = new int[5]; // Create an array with a length of 5
myArray2[0] = 1; // Add a value to the array at position 0
String[] myArray3 = new String[5]; // Create an array with a length of 5
String[] myArray2 = {"Hello", "World"}; // Create an array and adds 2 Strings
int number = 100;
Kugel array[] = new Kugel[number]; // erstellt ein array mit dem namen array und der länge number




// methods
(int) Math.random()*101; //random number between 0-100 // 101 because (int) rounds down
Math.pow(2, 3); // 2^3
Math.sqrt(9); // square root of 9
Math.abs(-4.7); // absolute value of -4.7
Math.max(5, 10); // highest value of 5 and 10
Math.min(5, 10); // lowest value of 5 and 10
Math.round(4.7); // round 4.7 to the nearest integer
Math.ceil(4.7); // round 4.7 up to the nearest integer
Math.floor(4.7); // round 4.7 down to the nearest integer
Math.sin(90); // sine of 90 degrees
Math.cos(90); // cosine of 90 degrees
Math.tan(90); // tangent of 90 degrees
Math.asin(0.5); // arcsine of 0.5
Math.acos(0.5); // arccosine of 0.5
Math.atan(0.5); // arctangent of 0.5
Math.toDegrees(1.5708); // convert 1.5708 from radians to degrees
Math.toRadians(90); // convert 90 from degrees to radians

// toString
@Override
public String toString() {
    return "String " + 3;
}
// constructor
public NameDerClasse() {
    // this(0, 3, 4); // super(0, 3, 4);
    // code block to be executed when the object is created
    // this.Variablenname = Variablenname;
}

getMethod(); // returns the value of the variable
setMethod(); // sets the value of the variable

// abstract class
public abstract class NameDerAbstraktenKlasse {
    public abstract void nameDerMethode(); // abstract method
}

// child class
public class NameDerKindKlasse extends NameDerElternKlasse {
    public void nameDerMethode() {
        // code block to be executed
    }
}

Random r = new Random(); // Create a Random object
r.nextInt(100); // Generate a random number between 0-99