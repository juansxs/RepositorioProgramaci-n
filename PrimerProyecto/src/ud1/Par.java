package ud1;

/** @author Juan **/
import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para evaluarlo: ");
        int numero = sc.nextInt();
        sc.close();

        //Proceso
        int operacion = numero % 2;
        boolean resultado = operacion == 0;

        //Salida
        System.out.println("Era tu número par ? --> " + resultado);
        
        









    }

}
