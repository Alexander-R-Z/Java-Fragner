public class Operatoren {
    public static void main (String[] args) {
        for (int i=0; i<10; i++) { // i++ ist das gleiche wie i=i+1
            System.out.println("i="+i);
        }
        for (int i=10; i>0; i--) { // i-- ist das gleiche wie i=i-1
            System.out.println("i="+i);
        }

        int a=5;

        System.out.println("a="+a+"a<<=1 = "+(a<<=1)); // a<<=1 ist das gleiche wie a=a<<1 was das gleiche ist wie a=a*2 (101=5, 1010=10)
        
        
        a=10;
        
        if (a==10) {
            System.out.println("a ist 10");
        }
        if (a!=10) {
            System.out.println("a ist nicht 10");
        }
        if (a>=5) {
            System.out.println("a ist größer oder gleich 5");
        }
        if (a<=5) {
            System.out.println("a ist kleiner oder gleich 5");
        }
        if (a==10 && a>=5) {
            System.out.println("a ist 10 und größer oder gleich 5");
        }
        if (a==10 || a>=5) {
            System.out.println("a ist 10 oder größer oder gleich 5");
        }
        if (a==10 ^ a>=5) {
            System.out.println("a ist 10 oder größer oder gleich 5, aber nicht beides");
        }
        if (!(a==10)) {
            System.out.println("a ist nicht 10");
        }
    }
}