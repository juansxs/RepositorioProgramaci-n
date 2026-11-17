package ud2.ejercicios;

import java.util.Scanner;

public class ValidarDNI2 {

    public static boolean esCorrecto(int num) {
        if (num < 99999999 && num > 9999999) {
            return true;
        } else
            return false;
    }

    public static char letraDni(int num) {

        int resto = num % 23;
        String cadenaDni = "TRWAGMYFPDXBNJZSQVHLCKE";

        switch (resto) {
            case 0:
                return cadenaDni.charAt(0);
            case 1:
                return cadenaDni.charAt(1);
            case 2:
                return cadenaDni.charAt(2);
            case 3:
                return cadenaDni.charAt(3);
            case 4:
                return cadenaDni.charAt(4);
            case 5:
                return cadenaDni.charAt(5);
            case 6:
                return cadenaDni.charAt(6);
            case 7:
                return cadenaDni.charAt(7);
            case 8:
                return cadenaDni.charAt(8);
            case 9:
                return cadenaDni.charAt(9);
            case 10:
                return cadenaDni.charAt(10);
            case 11:
                return cadenaDni.charAt(11);
            case 12:
                return cadenaDni.charAt(12);
            case 13:
                return cadenaDni.charAt(13);
            case 14:
                return cadenaDni.charAt(14);
            case 15:
                return cadenaDni.charAt(15);
            case 16:
                return cadenaDni.charAt(16);
            case 17:
                return cadenaDni.charAt(17);
            case 18:
                return cadenaDni.charAt(18);
            case 19:
                return cadenaDni.charAt(19);
            case 20:
                return cadenaDni.charAt(20);
            case 21:
                return cadenaDni.charAt(21);
            case 22:
                return cadenaDni.charAt(22);

            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu número de DNI para averiguar la letra: ");
        int numeroDni = sc.nextInt();

        while (esCorrecto(numeroDni) == false){
           
           System.out.println("El número del DNI no es válido.");

           System.out.println("Vuelve a introducir el número del DNI:");
           numeroDni = sc.nextInt();

        

        } 

        sc.close();
        System.out.println("La letra del DNI: " + numeroDni + " es: " + letraDni(numeroDni));

    }
}
