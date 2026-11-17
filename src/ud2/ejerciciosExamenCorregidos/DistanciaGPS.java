package ud2.ejerciciosExamenCorregidos;

/** @author Juan */
public class DistanciaGPS {
    public static void main(String[] args) {
        
    }
    static  double distancia(double lat1, double lon1, double lat2, double lon2) {
        final double R = 6371;
        double lat1R = Math.toRadians(lat1);
        double lon1R = Math.toRadians(lon1);
        double lat2R = Math.toRadians(lat2);
        double lon2R = Math.toRadians(lon2);
        double a = Math.pow(Math.sin((lat2R - lat1R) / 2), 2) + Math.cos(lat1R) * Math.cos(lat2R) * Math.pow(Math.sin((lon2R - lon1R) / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c;
    }
}
