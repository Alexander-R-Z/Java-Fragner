package code;
public class Teilen_mit_int_und_double {
    public static void main (String[] args) {
        int a=7, b=5;
        double ad=7, bd=5;
        if (a/b==ad/bd) {
            System.out.println(a/b+" = a/b==ad/bd = "+ad/bd+" int a="+a+" / int b"+b+" ist gleich double ad="+ad+" / double bd="+bd);
        }
        else {
            System.out.println(a/b+" = a/b!=ad/bd = "+ad/bd+" int a="+a+" / int b"+b+" ist nicht gleich double ad="+ad+" / double bd="+bd);
        }
    }
}
