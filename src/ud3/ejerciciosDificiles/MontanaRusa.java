package ud3.ejerciciosDificiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/** @author Juan */
public class MontanaRusa {
    public static void main(String[] args) {

        int[] primerTest = { 4, 10, 3, 2 };
        System.out.println(contarPicos(primerTest));

    }

    public static int contarPicos(int[] alturas) {
        int alturaActual = 0;
        int alturaAnterior = 0;
        int alturaPosterior = 0;
        int contadorPicos = 0;
        
        for (int i = 0; i < alturas.length; i++) {
            alturaActual = alturas[i];
            
            if (i != 0) {
                alturaAnterior = alturas[i - 1];
            }
            if (i < alturas.length - 1) {
                alturaPosterior = alturas[i + 1];
            }
            if ((alturaActual > alturaAnterior && alturaActual > alturaPosterior)) {
                contadorPicos++;
            }
        }
        return contadorPicos;
    }
    @Test 
    public void testContarPicos_CasoBase() { 
    int[] alturas = { 1, 2, 3, 2, 1 }; 
    assertEquals(1, contarPicos(alturas)); 
    } 
    @Test 
    public void testContarPicos_MultiplesPicos() { 
    int[] alturas = { 1, 2, 3, 2, 1, 0, 1, 2, 3, 2, 1 }; 
    assertEquals(2, contarPicos(alturas)); 
    } 
    @Test 
    public void testContarPicos_PicoAlFinal() { 
    int[] alturas = { 1, 2, 3, 4, 5 }; 
    assertEquals(1, contarPicos(alturas)); 
    } 
    @Test 
    public void testContarPicos_PicoEnInicio() { 
    int[] alturas = { 5, 4, 3, 2, 3, 4, 4 }; 
    assertEquals(1, contarPicos(alturas)); 
    } 
    @Test 
    public void testContarPicos_MontañaCircularSinPicos() { 
    int[] alturas = { 3, 2, 1, 2, 3 }; 
    assertEquals(0, contarPicos(alturas)); 
    } 
    @Test 
    public void testContarPicos_MontañaCircularConVariosPicos() { 
    int[] alturas = { 3, 2, 1, 2, 1, 2, 1, 2, 3 }; 
    assertEquals(2, contarPicos(alturas)); 
    } 


}
