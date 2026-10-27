package ud2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemplosExcepciones {
    public static void main(String[] args) {
        
        try {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número entero");
        int num = sc.nextInt();

        System.out.print("Escribe otro número entero");
        int num2 = sc.nextInt();
        System.out.println("a / b = " + num / num2);

        } catch (InputMismatchException e) {
            System.out.println("ERROR: Has introducido algo diferente a un número entero");
        } catch (ArithmeticException e) {
            System.out.println("El denominador no puede ser 0" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Se ha producido un error inesperado");
        } finally {
            System.out.println("Esto se ejecuta sin excepción");
        }
        //Siempre se pone de más general a menos porque si pones la más general de primera las otras nunca se van a ejecutar.


    }

}
