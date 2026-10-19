package ud2.ejercicios;

/** @author Juan **/
public class MCD {
    public static void main(String[] args) {

        System.out.println(maximoComunDivisor(45, 5));
    }

    public static double maximoComunDivisor(double a, double b) {
        if (a > b) {
            return 
            maximoComunDivisor(a - b, b);
        } else if (b > a) {
            return 
            maximoComunDivisor(a, b - a);

        } else if (b == 0) {
            return a;
        } else {
            return b;
        }
    }

}
