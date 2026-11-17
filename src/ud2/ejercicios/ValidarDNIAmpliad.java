package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class ValidarDNIAmpliad {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numDNI ;
       

       
        System.out.print("Introduce un número de DNI: ");
        numDNI = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce una letra del dni");
        char letraDNIVerdadera = sc.nextLine().charAt(0);
        //} while (numDNI <= 99999999 || numDNI > 99999999);
        System.out.println("Tu letra es: " + letraDNI(numDNI));
        System.out.println("Es tu letra correcta --> " + esLetraValida(letraDNIVerdadera, numDNI));
        sc.close();
    }

    public static char letraDNI(int numDNI) {
            
        
        int letra = numDNI % 23;
        switch (letra) {
            case 0:
                return 'T';

            case 1:
                return 'R';

            case 2:
                return 'W';

            case 3:
                return 'A';

            case 4:
                return 'G';

            case 5:
                return 'M';

            case 6:
                return 'Y';

            case 7:
                return 'F';

            case 8:
                return 'P';

            case 9:
                return 'D';

            case 10:
                return 'X';

            case 11:
                return 'B';

            case 12:
                return 'N';

            case 13:
                return 'J';

            case 14:
                return 'Z';

            case 15:
                return 'S';

            case 16:
                return 'Q';

            case 17:
                return 'V';

            case 18:
                return 'H';

            case 19:
                return 'L';

            case 20:
                return 'C';

            case 21:
                return 'K';

            case 22:
                return 'E';

            default:
                return ' ';

            }

    }
    public static boolean esLetraValida(char letraDNIVerdadera, int numDNI) {
        
        switch (letraDNIVerdadera) {
            case 'T':
                letraDNIVerdadera = 'T';

            case 'R':
                letraDNIVerdadera = 'R';

            case 'W':
                letraDNIVerdadera = 'W';

            case 'A':
                letraDNIVerdadera = 'A';

            case 'G':
                letraDNIVerdadera = 'G';

            case 'M':
                letraDNIVerdadera = 'M';

            case 'Y':
                letraDNIVerdadera = 'Y';

            case 'F':
                letraDNIVerdadera = 'F';

            case 'P':
                letraDNIVerdadera = 'P';

            case 'D':
                letraDNIVerdadera = 'D';

            case 'X':
                letraDNIVerdadera = 'X';

            case 'B':
                letraDNIVerdadera = 'B';

            case 'N':
                letraDNIVerdadera = 'N';

            case 'J':
                letraDNIVerdadera = 'J';

            case 'Z':
                letraDNIVerdadera = 'Z';

            case 'S':
                letraDNIVerdadera = 'S';

            case 'Q':
                letraDNIVerdadera = 'Q';

            case 'V':
                letraDNIVerdadera = 'V';

            case 'H':
                letraDNIVerdadera = 'H';

            case 'L':
                letraDNIVerdadera = 'L';

            case 'C':
                letraDNIVerdadera = 'C';

            case 'K':
                letraDNIVerdadera = 'K';

            case 'E':
                letraDNIVerdadera = 'E';

            default:
                letraDNIVerdadera = ' ';

            }
        

        
        
        
        if (letraDNI(numDNI) == letraDNIVerdadera) {
            return true;
        } else {
            return false;
        }
    }



}
