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
        double discriminante = Math.pow(b, 2) - (4 * a * c);
        double operacion1 = (- b + Math.sqrt(discriminante)) / (2 * a);
        double operacion2 = (- b - Math.sqrt(discriminante)) / (2 * a);
        boolean resultado = discriminante < 0;
        
       // boolean resultado = operacion1 < 0;  Si el discriminante es negativo la raiz devulve NaN por lo que 
       // cualquier operación relacional sera falsa da igual el número

        //Salida
        System.out.println("Tu ecuación tiene solución real? --> " + resultado);
        System.out.print("Los resultados de tu ecuación es: " + operacion1 + " y " + operacion2);
        
        
        





    }

}
