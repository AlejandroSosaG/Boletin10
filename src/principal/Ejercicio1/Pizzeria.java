package principal.Ejercicio1;

enum Tipo{Margarita, CuatroQuesos, Funghi}
enum Estado{Pedido, Servido}

public class Pizzeria {
    Tipo tipo;
    static Estado estado;

    public Pizzeria(Tipo tipo) {
        this.tipo = tipo;
        this.estado = Estado.Pedido;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public static void sevir(){
        estado=Estado.Servido;
    }

    @Override
    public String toString() {
        return "Pizzeria{" +
                "estado=" + estado +
                '}';
    }

    public static void mostrarResumen(){
        System.out.println("El nº de pizzas pedidas es ");
        System.out.println("El nº de pizzas servidas es ");
        System.out.println("El nº de paninis pedidos es ");
        System.out.println("El nº de paninis servidos es ");
    }

}
