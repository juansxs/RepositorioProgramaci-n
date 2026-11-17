package ud2.ejercicios;

import javax.swing.JOptionPane;

/** @author Juan **/
public class ComprobarHora {

    public static void compruebaLaHora(int hora, int minutos, int segundos) {
        boolean esHoraCorrecta = !(hora > 23 || hora < 0 || minutos > 59 || minutos < 0 || segundos > 59 || segundos < 0);
        System.out.println(esHoraCorrecta);
    }

    static boolean esHoraCorrecta(int hora, int minutos, int segundos) {
        return !(hora > 23 || hora < 0 || minutos > 59 || minutos < 0 || segundos > 59 || segundos < 0);
    }

    public static void main(String[] args) {

        compruebaLaHora(0, 0, 0);
        compruebaLaHora(-1, 0, 0);
        compruebaLaHora(0, 60, 0);
        compruebaLaHora(0, 0, 60);
        
        JOptionPane.showMessageDialog(null, esHoraCorrecta(23, 59, 59));

    
    }
}



