package principal.Ejercicio4;

public class Main4 {
    public static void main(String[] args) {
        Piano piano = new Piano();
        Campana campana = new Campana();
        // Vamos a añadir 20 notas al piano y 10 notas a la campana.
        pedirNotas();
        piano.tocarNotas();
        campana.tocarNotas();

    }
}
