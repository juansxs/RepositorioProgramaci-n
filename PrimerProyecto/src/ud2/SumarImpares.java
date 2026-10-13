package ud2;

/** @author Juan **/
public class SumarImpares {
    public static void main(String[] args) {

        int num = 1;
        int suma = 0;

        while (num <= 19) {

            suma = suma + num;
            num += 2;

        }
        System.out.println("La suma de los 10 primeros número impares es " + suma);
    }

}
