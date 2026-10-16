package ud2.ejercicios;

/** @author juan **/

public class Maximo2 {

    public static int rango(int a, int b) {
        return Math.max(a, b);

    }

    public static int rango(int a, int b, int c) {
        int maximo = Math.max(a, b);
        return Math.max(maximo, c);
    }

    public static int rango(int a, int b, int c, int d) {
        int maximo = Math.max(a, b);
        int maximo2 = Math.max(c, d);
        return Math.max(maximo, maximo2);

    }

    public static void main(String[] args) {
        System.out.println(rango(4, 9));
        System.out.println(rango(4, 9, 16));
        System.out.println(rango(4, 9, 16, 25));

    }

}