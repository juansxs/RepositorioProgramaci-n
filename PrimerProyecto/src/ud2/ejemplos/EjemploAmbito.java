package ud2.ejemplos;

public class EjemploAmbito {

    public static int numero = 45; // Se puede usar en cualquier método de esta clase --> Variable de clase

    public static void main(String[] args) {
        System.out.println(numero);
        // --> Variables locales o de método
        int i = 0;
        int j = 1;

        if (j == 1) {
            int z = 1; // --> Variable de bloque
            System.out.println(i);
        }
        metodo1();
        System.out.println(i);

        // System.out.println(z); Variable no accesible aquí

        metodo2(i);
        System.out.println(metodo3(i)); // Esto va a devolver un 1 ya que i valía 0,
        // por lo que esto es un método para sumar un. Tambien se llama función
    }

    public static void metodo1() {
        System.out.println(numero);
        int i = 3; // Se puede ya que es otro método diferente
        System.out.println(i);
    }

    public static void metodo2(int i) {
        System.out.println(numero);
        System.out.println(i);

    }

    public static int metodo3(int i) {
        i++;
        System.out.println(i);
        return i;

    }

    public static void metodo4(int i) {
        if (i == 0) {
            return; // Aunque el método no devuelva nada se usa ya que cuando se usa un return se
                    // finaliza el método, es como un brake pero para métodos, sin embargo este si se puede usar y no
                    // contradice las reglas de la programación estructurada
        }
        i++;
        System.out.println(i);

    }

}
