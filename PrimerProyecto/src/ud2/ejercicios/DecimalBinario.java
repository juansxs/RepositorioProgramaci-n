package ud2.ejercicios;

/** @author Juan **/
public class DecimalBinario {
    public static void main(String[] args) {
        System.out.println(decimalABinario(13));
        System.out.println(decimalABinario(53));
        System.out.println(decimalABinario(23));
        System.out.println(decimalABinario(242));
    }

    public static String decimalABinario(int numero) {
        String binario = "";
        while (numero > 0) {
            int resto = numero % 2;
            binario = resto + binario;
            numero /= 2;
        }
        return binario;
    }

}
