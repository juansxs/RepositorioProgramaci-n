package ud2;

public class EjemploSwitch {
    public static void main(String[] args) {
        int pos = 3;

        switch (pos) {
            case 1:
                System.out.println("Medalla de oro");
                break;
            case 2:
                System.out.println("Medalla de plata");
                break;
            case 3:
                System.out.println("Llegaste de tercer@");
                System.out.println("Medalla de bronce");
                break;
            default:
                System.out.println("No hay podio");
                break;
        }
        System.out.println("Fin del programa");
    }

}
