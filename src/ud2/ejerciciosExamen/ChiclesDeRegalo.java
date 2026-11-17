package ud2.ejerciciosExamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/** @author Juan **/
public class ChiclesDeRegalo {
    public static void main(String[] args) {
        System.out.println(totalChicles(25, 5, 1));
        System.out.println(totalChicles(5, 5, 1));
        System.out.println(totalChicles(100, 10, 1));
        System.out.println(totalChicles(100, 0, 0));
        System.out.println(totalChicles(20, 2, 5));
        System.out.println(totalChicles(100, 10, 2));
        System.out.println(totalChicles(102, 5, 2));
        System.out.println("hola");


    }
    @Test 
    public void testChicles() {
        assertEquals(31, totalChicles(25    , 5, 1));
    }
        @Test 
    public void testChicles1() {
        assertEquals(6, totalChicles(5, 5, 1));
    }
        @Test 
    public void testChicles2() {
        assertEquals(111, totalChicles(100, 10, 1));
    }
        @Test 
    public void testChicles3() {
        assertEquals(100, totalChicles(100, 0, 0));
    }
        @Test 
    public void testChicles4() {
        assertEquals(-1, totalChicles(20, 2, 5));
    }
        @Test 
    public void testChicles5() {
        assertEquals(-1, totalChicles(10, -1, 0));
    }
        @Test 
    public void testChicles6() {
        assertEquals(124, totalChicles(100, 10, 2));
    }













    static int totalChicles(int chiclesIniciales, int envoloriosRequeridos, int chiclesRegalados) {

        if (chiclesIniciales < 0 || envoloriosRequeridos < 0 || chiclesRegalados < 0) {
            return -1;

        } else if (chiclesRegalados > envoloriosRequeridos) {
            return -1;

        } else if (envoloriosRequeridos == 0) {
            return chiclesIniciales;
        }
        int chiclesRegaladosPrimero = chiclesIniciales / envoloriosRequeridos;
        int chiclesTotales = 0;
        while (chiclesIniciales >= envoloriosRequeridos) {
        chiclesTotales = chiclesIniciales + (chiclesRegaladosPrimero) + (chiclesRegaladosPrimero / envoloriosRequeridos);
        chiclesIniciales -= envoloriosRequeridos;
        }
        return chiclesTotales;

    }
}