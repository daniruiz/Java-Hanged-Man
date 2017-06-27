package hangedMan;

public class TerminalPrinter {

    public static void println() {
        System.out.println();
    }

    public static void println(String s) {
        System.out.println(s);
    }

    public static void print(String s) {
        System.out.print(s);
    }

    public static void clearLines(int num) {
        String str = "";
        for (int i = 0; i < num; i++)
            str += '\n';
        TerminalPrinter.print(str);
    }

    public static void clearScreen() {
        TerminalPrinter.clearLines(100);
    }

    public static void printTitle(String t) {
        TerminalPrinter.clearLines(4);
        TerminalPrinter.println("\t\t---------------------- ====== " + t + " ======----------------------\n");
    }

    public static void showWin(String selectedWord, int attemps, String usedLetters) {
        TerminalPrinter.printTitle("HAS GANADO");
        TerminalPrinter.println("\tEn efecto, la palabra era \"" + selectedWord + '"');
        TerminalPrinter.println("\t\t[Intentos restantes: " + attemps + "]");
        TerminalPrinter.println("\t\t[Letras empleadas: " + usedLetters + "]");
    }

    public static void showGameOver(String selectedWord, String state, String usedLetters) {
        TerminalPrinter.printTitle("HAS PERDIDO");
        TerminalPrinter.println("\tLa palabra era " + selectedWord + ", pero solo has encontrado " + state);
        TerminalPrinter.println("\t\t[Letras empleadas: " + usedLetters + "]");
    }
}