import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Variables para los 11 jugadores
        Jugadores jugador1 = Jugadores.solicitarJugador(1);
        Jugadores jugador2 = Jugadores.solicitarJugador(2);
        Jugadores jugador3 = Jugadores.solicitarJugador(3);
        Jugadores jugador4 = Jugadores.solicitarJugador(4);
        Jugadores jugador5 = Jugadores.solicitarJugador(5);
        Jugadores jugador6 = Jugadores.solicitarJugador(6);
        Jugadores jugador7 = Jugadores.solicitarJugador(7);
        Jugadores jugador8 = Jugadores.solicitarJugador(8);
        Jugadores jugador9 = Jugadores.solicitarJugador(9);
        Jugadores jugador10 = Jugadores.solicitarJugador(10);
        Jugadores jugador11 = Jugadores.solicitarJugador(11);

        // Mostrar el 11 titular
        String onceTitular = "El 11 titular es:\n"
                + "1. " + jugador1.getNombre() + "\n"
                + "2. " + jugador2.getNombre() + "\n"
                + "3. " + jugador3.getNombre() + "\n"
                + "4. " + jugador4.getNombre() + "\n"
                + "5. " + jugador5.getNombre() + "\n"
                + "6. " + jugador6.getNombre() + "\n"
                + "7. " + jugador7.getNombre() + "\n"
                + "8. " + jugador8.getNombre() + "\n"
                + "9. " + jugador9.getNombre() + "\n"
                + "10. " + jugador10.getNombre() + "\n"
                + "11. " + jugador11.getNombre();

        JOptionPane.showMessageDialog(null, onceTitular);
    }
}
