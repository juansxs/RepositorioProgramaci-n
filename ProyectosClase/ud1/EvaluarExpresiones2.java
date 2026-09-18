package ud1;

public class EvaluarExpresiones2 {
    public static void main(String[] args) {
        int resultado = 10;
        
        resultado += 5 - 3 * 2; //resultado = 9;
        
        boolean resultado1 = 4 + 5 > 10 - 3;   // 9 > 7 = true;
        
        boolean resultado2 = 5 > 3 && 8 < 6 || 3 == 3; // T && F || T = true
        
        int resultado3 = (4 + 3) * 2 - 6 / 3; // 7 * 2 - 6 / 3 = 14 - 2 = 12;
        
        int a = 10, b = 20;

        int resultado4 = a > b ? a : b;  //resultado = 20;
        /*Es mayor a que b ? Si la expresión es verdad el resultado 
         será a si es falso saldra el valor de b;*/

        int x = 5;

        int resultado5 = x++ * 2; // resultado = 12;
        /*  ++x es lo mismo que poner x = x + 1 si se pone los
          signos antes de la x y esta esta dentro de su operación, se hace primero 
         el incremento y después la operación, si estan
          despues de la x se hace la operaciónen la que este y luego se hace el incremento.*/
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println(resultado5);
        System.out.println(resultado);
    }

}
