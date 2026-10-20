package ud2.ejercicios;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println(calculadora(2, 3, 1));
        System.out.println(calculadora(2, 3, 2));
        System.out.println(calculadora(2, 3, 3));
        System.out.println(calculadora(2, 0, 4));
        System.out.println(calculadora(2, 3, 5));
    }

    public static double calculadora(double operando1, double operando2, int operacion) {
        double resultado;
        switch (operacion) {
            case 1: resultado = operando1 + operando2; break;
            case 2: resultado = operando1 - operando2; break;
            case 3: resultado = operando1 * operando2; break;
            case 4: resultado = operando1 / operando2; break;
            default: resultado = 0;
                
        }
        return resultado;
    }

}
