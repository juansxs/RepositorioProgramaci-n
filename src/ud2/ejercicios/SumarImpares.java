package ud2.ejercicios;

/** @author Juan **/
public class SumarImpares {
    public static void main(String[] args) {
        final int NUM_IMPARES = 10;
        int num = 1;
        int suma = 0;

        for (int i = 0; i < NUM_IMPARES; i++) {
            suma = suma + num;
            num += 2;
        }

        System.out.println("La suma de los " + NUM_IMPARES + " primeros números impares es " + suma);
    }

}
