import hangedMan.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        char selected = 'n';
        do {
            try {
                hangedMan.Game game = new hangedMan.Game("WordList.txt");
                game.setDifficulty();
                game.start();
            } catch (IOException e) {
                TerminalPrinter.println("Hubo un problema al intentar leer la lista de palabras.");
            }
            TerminalPrinter.println();
            selected = TerminalReader.readChar("\n¿Volver a jugar? (S/n): ");
        } while (selected == 'S' || selected == 's');
    }
}
