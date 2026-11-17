package ud2.ejercicios;

/** @author Juan **/
public class BinarioDecimal {
    public static void main(String[] args) {
        System.out.println(binarioAdecimal("1011"));
        
    }
    public static int binarioAdecimal(String numero) {
        int i = 0;
        int decimal = 0;
        boolean continuar = true;
        while (continuar) {
            try {
                decimal = (decimal * 2) + numero.charAt(i) - 0;
                i++;
            } catch (StringIndexOutOfBoundsException e) {
                continuar = false;
            }
            
        }
        return decimal;
    }

}
