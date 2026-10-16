package ud2.ejercicios;

/** @author Juan */

import java.util.Scanner;

public class EsVocal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una letra >>> ");
        char x = sc.next().charAt(0);
        sc.close();

        System.out.print("Es vocal : " + isVowel(x));
    }

    public static boolean isVowel(char x) {
        switch (x) {
            case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u':
                return true;
            default:
                return false;
        }
    }
} 
