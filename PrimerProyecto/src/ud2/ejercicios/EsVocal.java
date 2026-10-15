package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class EsVocal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una letra para saber si  es una vocal o no: ");
        String letra = sc.nextLine();
        sc.close();

        System.out.println("Hay vocal? --> " + comprobarLetra(letra));

    }

    public static boolean comprobarLetra(String letra) {
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            return true;
        } else {
            return false;
        }

    }

}
