package ud1;

/** @author Juan **/
import java.util.Scanner;

public class EcuacionGrado2 {
    public static void main(String[] args) {
        
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las tres variables a, b y c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        //Proceso
        double operacion1 = (- b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double operacion2 = (- b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        boolean resultado = operacion1 < 0;

        //Salida
        System.out.println("Tu ecuación tiene solución real? --> " + resultado);
        System.out.printf("Los resultados de tu ecuación es: %.2f", operacion1);
        System.out.printf(" y %.2f", operacion2);
        
        





    }

}
