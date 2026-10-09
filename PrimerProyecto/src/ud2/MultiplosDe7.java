package ud2;

/** @author Juan **/
public class MultiplosDe7 {
    public static void main(String[] args) {
        final int MAX = 100;
        final int DIVISOR = 7;

        for (int i = 0; i < MAX; i++) {
            if (i % DIVISOR == 0) {
                System.out.println(i);
            }
        }

    }

}
