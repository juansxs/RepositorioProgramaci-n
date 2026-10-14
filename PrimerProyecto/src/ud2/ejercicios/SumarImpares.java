package ud2.ejercicios;

/** @author Juan **/
public class SumarImpares {
    public static void main(String[] args) {
        final int CUENTA_IMPARES = 19;
        int num = 1;
        int suma = 0;

        while (num <= CUENTA_IMPARES) {

            suma = suma + num;
            num += 2;

        }
        System.out.println("La suma de los 10 primeros número impares es " + suma);
    }

}
