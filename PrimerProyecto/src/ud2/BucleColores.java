package ud2;

/** @author Juan **/
public class BucleColores {
    public static void main(String[] args) {
        final int MAX = 50;

        for (int i = 0; i < MAX; i++) {
            String color = "\033[" + 1 + "m";
            System.out.println(color + "\033[" + i + "m");
        }
        
        //"\n" --> salto de linea
        //"\t" --> tabulación
        //"\\" --> Imprimir una barra inclinada
        //"\"" --> Imprimir unas comillas dobles
    }

}
