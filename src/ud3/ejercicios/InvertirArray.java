package ud3.ejercicios;

import java.util.Arrays;

/**@author Juan */
public class InvertirArray {
    public static void main(String[] args) {
        int[] t = { 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(invertirArray(t)));
    }
    static int[] invertirArray (int[] t) {
        int[] tAux = new int[t.length];
        
        for (int i = t.length - 1; i >= 0; i--) {
            tAux[i] = t[t.length - i - 1];
            
        }
        return tAux;
    }
}
