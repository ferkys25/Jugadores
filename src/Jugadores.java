import javax.swing.*;

public class Jugadores {
    private String nombre;

    // Constructor
    public Jugadores(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo para solicitar el nombre de cada jugador
    public static Jugadores solicitarJugador(int numero) {
        String nombre;
        do {
            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador " + numero + ":");
            if (nombre == null || nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nombre inválido. Por favor ingrese un nombre válido.");
            }
        } while (nombre == null || nombre.trim().isEmpty());

        return new Jugadores(nombre);
    }
}


