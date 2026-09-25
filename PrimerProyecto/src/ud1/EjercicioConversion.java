package ud1;

public class EjercicioConversion {
    public static void main(String[] args) {

        short s = 5;
        int i = s;
        long l = i;
        float f = l;

        int num = 80;
        char letra = (char) num;
        System.out.println(letra);
        letra += ('a' - 'A');
        System.out.println(letra);

        int x2 = 100;
        double y2 = 20.5;
        double resultado2 = x2 + (int) y2;
        System.out.println(resultado2);
        // Java hace una conversión de ensanchamiento y mete todo siempre
        // en el dato más grande

        long grande = 9876543210L;
        int pequenho = (int) grande;
        System.out.println(pequenho);
        // Casting con perdida de información

        char c = 'A';
        int ascii = (int) c;
        System.out.println(ascii);

        byte b3 = 120;
        int resultado3 = b3 + 10;
        System.out.println(resultado3);
    }

}
