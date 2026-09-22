package ud1;

import java.util.Scanner;

public class EjemplosConversionesTipos {
    public static void main(String[] args) {
        
        double a = 56;
        System.out.println(a);

        int b = (int)5.6; /*La expresión de la derecha la asignas al tipo de datos que 
        pones entre parentesis. Es una conversión de tipo explicita o de estrechamiento
        ya que como puedes ver se pierden datos.*/
        System.out.println(b);

        float c = 923546923444444443l;
        System.out.println(c);

        int num = Integer.parseInt("9823462"); // Con datos tipo int
        System.out.println(num + 5);

        double num2 = Double.parseDouble("3786548.34");
        System.out.println(num2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una letra: ");
        char letra = sc.nextLine().charAt(0);
        sc.close();

        System.out.println(letra);
    }

}
