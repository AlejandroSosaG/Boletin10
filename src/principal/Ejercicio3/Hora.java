package principal.Ejercicio3;

public class Hora {
    int hora, minuto;
    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public static void inc(){

    }
    @Override
    public String toString() {
        return "Hora{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                '}';
    }
}
