package ud3.programacionParejas;

public class ProgramacionEnParejas10Noviembre {

    public static int sumaPares(int[] nums) {

        int suma = 0;
        int numero = 0;
        for (int i = 0; i < nums.length; i++) {
            numero = nums[i];

            if (numero % 2 == 0) {
                suma += numero;
            }
        }

        return suma;
    }

    public static int primerNegativo(int[] nums) {

        int contadorPositivos = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0) {
                return i;
            } else {
                contadorPositivos++;
            }
        }

        if (contadorPositivos == nums.length) {
            return -1;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] prueba = { 4, 7, 2, 9, 10, 3, 8 };

        int[] prueba2 = { 3, 5, -2, 7, -8 };
        int[] prueba3 = { 1, 2, 3 };

        System.out.println(sumaPares(prueba));

        System.out.println(primerNegativo(prueba2));
        System.out.println(primerNegativo(prueba3));
        System.out.println(ultimoNegativo(prueba2));

    }

    public static int ultimoNegativo(int[] nums) {
         int contadorPositivos = 0;
        for (int i = nums.length - 1  ; i >= 0; i--) {

            if (nums[i] < 0) {
                return nums.length - i;
            } else {
                contadorPositivos++;
            }
        }

        if (contadorPositivos == nums.length) {
            return -1;
        }

        return 0;


    }
}
