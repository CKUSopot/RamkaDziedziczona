import javax.swing.*;
import java.awt.*;

/**
 * Zadanie 4: RamkaDziedziczona.
 * Przepisz Zadanie 3, ale zamiast tworzyć obiekt JFrame w main, utwórz klasę
 * RamkaGlowna która dziedziczy po JFrame. Przenieś całą konfigurację okna (tytuł,
 * rozmiar, zamknięcie) do konstruktora klasy RamkaGlowna. W metodzie main po prostu
 * utwórz obiekt new RamkaGlowna();
 */

// Klasa RamkaGlowna dziedziczy po klasie bazowej JFrame (podejście obiektowe)
public class RamkaGlowna extends JFrame {

    // Konstruktor klasy, w którym konfigurujemy właściwości okna
    public RamkaGlowna() {
        // Wywołanie metod konfiguracyjnych bezpośrednio na instancji ramki
        setTitle("Ramka Dziedziczona po JFrame");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Dodanie prostej zawartości w celu wizualizacji działania ramki
        // JLabel etykieta = new JLabel("To jest ramka utworzona przez dziedziczenie!", SwingConstants.CENTER);
        // add(etykieta, BorderLayout.CENTER);

        // Ustawienie widoczności na końcu konfiguracji w konstruktorze
        setVisible(true);
    }

    public static void main(String[] args) {
        // Utworzenie instancji klasy dziedziczącej, co uruchamia okno
        new RamkaGlowna();
    }
}