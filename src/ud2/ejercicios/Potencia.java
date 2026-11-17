package ud2.ejercicios;

/** @author Juan **/
public class Potencia {

    public static double potenciaRecursiva(double n, int nPotencia) {
        if (nPotencia == 0) {
            return 1;
        } else {
            return n * potenciaRecursiva(n, nPotencia - 1);
        }
    }

    public static double potenciaIterativa(double n, int nPotencia) {
        double num = 1;
        if (n == 0) {
             num = 1;
        } else {
            for (int i = 1; i <= nPotencia; i++) {
                num = num * n;
            }
        }
        return num;
    }
        
    

    public static void main(String[] args) {
        System.out.println(potenciaRecursiva(2, 3));
        System.out.println(potenciaIterativa(2, 3));
    }
}
