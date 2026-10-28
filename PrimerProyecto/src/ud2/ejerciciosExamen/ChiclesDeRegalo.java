package ud2.ejerciciosExamen;

/** @author Juan **/
public class ChiclesDeRegalo {
    public static void main(String[] args) {
        System.out.println(totalChicles(25, 5, 1));
        System.out.println(totalChicles(5, -1, 1));
        System.out.println(totalChicles(5, 5, 1));
        System.out.println(totalChicles(100, 10, 1));
        System.out.println(totalChicles(20, 2, 5));
        System.out.println(totalChicles(200, 0, 0));

    }

    static int totalChicles(int chiclesIniciales, int envoloriosRequeridos, int chiclesRegalados) {

        if (chiclesIniciales < 0 || envoloriosRequeridos < 0 || chiclesRegalados < 0) {
            return -1;

        } else if (chiclesRegalados > envoloriosRequeridos) {
            return -1;

        } else if (envoloriosRequeridos == 0) {
            return chiclesIniciales;
        }

        int chiclesTotales = 0;

        chiclesTotales = chiclesIniciales + (chiclesIniciales / envoloriosRequeridos);
        chiclesTotales /= envoloriosRequeridos;
        int chiclesFinales = chiclesIniciales + chiclesTotales;
        return chiclesFinales;

    }
}