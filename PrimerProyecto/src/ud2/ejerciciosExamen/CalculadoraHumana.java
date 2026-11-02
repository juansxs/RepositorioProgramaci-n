package ud2.ejerciciosExamen;

import java.util.Random;
import java.util.Scanner;

/** @author Juan **/
public class CalculadoraHumana {
    public static void main(String[] args) {
        final int MINIMO_NUMERO_ALEATORIO = 1;
        final int MAXIMO_NUMERO_ALEATORIO = 200;
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int numeroAciertos = 0;
        int numeroFallos = 0;
        mostrarInstrucciones();
        do {
        int primerNumero = generarNumeroAleatorio(MINIMO_NUMERO_ALEATORIO, MAXIMO_NUMERO_ALEATORIO, rnd);
        int segundoNumero = generarNumeroAleatorio(MINIMO_NUMERO_ALEATORIO, MAXIMO_NUMERO_ALEATORIO, rnd);
        String simboloOperacion = generarOperacion(rnd);
        int resultadoOperacion = 0;

        System.out.println(primerNumero + simboloOperacion + segundoNumero);
        resultadoOperacion = resultadoOperacion(primerNumero, segundoNumero, simboloOperacion, resultadoOperacion, rnd,
                MINIMO_NUMERO_ALEATORIO, MAXIMO_NUMERO_ALEATORIO);
        System.out.println(resultadoOperacion);
        pedirResultado(resultadoOperacion, sc, numeroAciertos, numeroFallos);
        } while(numeroAciertos + numeroFallos < 7);

    }

    public static String generarOperacion(Random rnd) {
        int numeroAleatorioOperacion = rnd.nextInt(1, 4 + 1);
        String simboloOperacion = " ";
        switch (numeroAleatorioOperacion) {
            case 1 ->
                simboloOperacion = "+";
            case 2 ->
                simboloOperacion = "-";
            case 3 ->
                simboloOperacion = "*";
            case 4 ->
                simboloOperacion = "/";
            default ->
                simboloOperacion = " ";
        }
        return simboloOperacion;
    }

    public static int generarNumeroAleatorio(final int MINIMO_NUMERO_ALEATORIO, final int MAXIMO_NUMERO_ALEATORIO,
            Random rnd) {
        int primerNumeroOperacion = rnd.nextInt(MINIMO_NUMERO_ALEATORIO, MAXIMO_NUMERO_ALEATORIO + 1);

        return primerNumeroOperacion;
    }

    public static void mostrarInstrucciones() {
        System.out.println(
                "Usted esta a punto de jugar a la calculadora humana.\nEn este juego deberá resolver 7 operaciones en menos de 60 segundos de lo contrario perderá.\nCosa que sucederá de mismo modo si falla 3 veces. Mucha suerte.");
    }

    public static int resultadoOperacion(int primerNumero, int segundoNumero, String simboloOperacion,
            int resultadoOperacion, Random rnd, final int MINIMO_NUMERO_ALEATORIO, final int MAXIMO_NUMERO_ALEATORIO) {

        switch (simboloOperacion) {
            case "+" ->
                resultadoOperacion = primerNumero + segundoNumero;
            case "-" ->
                resultadoOperacion = primerNumero - segundoNumero;
            case "*" ->
                resultadoOperacion = primerNumero * segundoNumero;
            case "/" -> {
                while (primerNumero % segundoNumero != 0) {
                    primerNumero = rnd.nextInt(MINIMO_NUMERO_ALEATORIO, MAXIMO_NUMERO_ALEATORIO + 1);
                    segundoNumero = rnd.nextInt(MINIMO_NUMERO_ALEATORIO, MAXIMO_NUMERO_ALEATORIO + 1);
                }
                resultadoOperacion = primerNumero / segundoNumero;
            }
            default ->
                resultadoOperacion = 0;
        }

        return resultadoOperacion;
    }

    public static int pedirResultado(int resultadoOperacion, Scanner sc, int numeroAciertos, int numeroFallos) {
        System.out.println("Introduce el resultado de la operación : ");
        int resultadoUsuarioOperacion = sc.nextInt();

        if (resultadoOperacion == resultadoUsuarioOperacion) {
            System.out.println("¡Has acertado!");
            numeroAciertos++;

        } else {
            System.out.println("¡Has fallado!");
            numeroFallos++;
        }

        if (numeroAciertos == 3) {
            System.out.println("Has fallado 3 veces. Game over.");
        }

        return resultadoOperacion;
    }

}
