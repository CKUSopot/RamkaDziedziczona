import javax.swing.*;
import java.awt.*;

/**
 * Zadanie 4: RamkaDziedziczona.
 * Przepisz Zadanie 3, ale zamiast tworzyć obiekt JFrame w main, utwórz klasę
 * RamkaGlowna która dziedziczy po JFrame. Przenieś całą konfigurację okna (tytuł,
 * rozmiar, zamknięcie) do konstruktora klasy RamkaGlowna. W metodzie main po prostu
 * utwórz obiekt new RamkaGlowna();
 */

public class RamkaDziedziczona {
    static void main(String[] args) {
        OknoStartowe frame = new OknoStartowe("Tytuł", 800, 600, null);
        frame.setVisible(true);
    }

    private static class OknoStartowe extends JFrame {
        public OknoStartowe(String tytuł, int i, int i1, Object o) {
            setTitle(tytuł);
            setSize(i, i1);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo((Component) o);
        }
    }
}
