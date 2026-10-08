package ud2;

import java.util.Random;
import java.util.Scanner;

/** @author Juan **/
public class JuegoSumas {
    public static void main(String[] args) {
        final int MIN_OP = 1;
        final int MAX_OP = 100;
        final int ERROR_MAX = 3;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int operando1, operando2, resultado;
        int resultadoUsuario;
        int contadorAciertos = 0;
        int contadorFallos = 0;
        System.out.printf("Resuelve las sumas: ");
        do {
            operando1 = rnd.nextInt(MIN_OP, MAX_OP);
            operando2 = rnd.nextInt(MIN_OP, MAX_OP);
            resultado = operando1 + operando2;

            System.out.printf("%d + %d =", operando1, operando2);
            resultadoUsuario = sc.nextInt();
            if (resultadoUsuario == resultado) {
                contadorAciertos++;
            } else {
                contadorFallos++;
                System.out.println("Has fallado, llevas: " + contadorFallos + " fallos.");
            }
        } while (contadorFallos < ERROR_MAX);
        
        System.out.println("Realicaste " + contadorAciertos + " sumas correctas.");






    }

}
