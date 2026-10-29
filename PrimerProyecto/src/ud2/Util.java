package ud2;

import java.util.Scanner;

public class Util {
    public static boolean esBisiesto(int anho) {
        return anho % 400 == 0 || anho % 4 == 0 && anho % 100 != 0;
    }

    public static boolean esFechaCorrecta(int dia, int mes, int anho) {
        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31) {
            return false;

        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;

        } else if (mes == 2 && dia > 28) {
            return false;

        } else if (dia < 0) {
            return false;

        } else {
            switch (mes) {
                case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
                    return true;

                default:
                    return false;

            }
        }
    } 

    public static boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            int resultado = n % i;
            if (resultado == 0) {
                return false;
            }
        }
        return true;
    }
    public static double leerDouble(Scanner sc, String msg) {
        System.out.print(msg);
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.println("Entrada no válida. Escribe un número válido");

        }
        return sc.nextDouble();
    }
















}

