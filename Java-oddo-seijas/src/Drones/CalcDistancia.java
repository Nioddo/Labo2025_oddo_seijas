package Drones;

public class CalcDistancia {

    private double latitudDestino;
    private double longitudDestino;

    public CalcDistancia(double latitudDestino, double longitudDestino) {
        this.latitudDestino = latitudDestino;
        this.longitudDestino = longitudDestino;
    }


    public double getLatitudDestino() {
        return latitudDestino;
    }

    public void setLatitudDestino(double latitudDestino) {
        this.latitudDestino = latitudDestino;
    }

    public double getLongitudDestino() {
        return longitudDestino;
    }

    public void setLongitudDestino(double longitudDestino) {
        this.longitudDestino = longitudDestino;
    }

    public static double calculo(double latitudDestino, double longitudDestino, double latitudOrigen, double longitudOrigen){
    // Convertir a radianes
    double lat1Rad = Math.toRadians(latitudOrigen);
    double lon1Rad = Math.toRadians(longitudOrigen);
    double lat2Rad = Math.toRadians(latitudDestino);
    double lon2Rad = Math.toRadians(longitudDestino);

    // Fórmula de Haversine
    double dLat = lat2Rad - lat1Rad;
    double dLon = lon2Rad - lon1Rad;
    double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
            Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    double radioTierraKm = 6371;
return radioTierraKm * c;
    }
}
