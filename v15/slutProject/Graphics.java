package slutProject;

import java.util.ArrayList;

public class Graphics {
    private static ArrayList<String> man = new ArrayList<>();

    /**
     * Creates the array. It should be run at the start of the program
     */
    public static void start() {
        man.add("  +---+\n" +
                "  |   |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "=========");
        man.add("  +---+\n" +
                "  |   |\n" +
                "  O   |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "=========");
        man.add("  +---+\n" +
                "  |   |\n" +
                "  O   |\n" +
                "  |   |\n" +
                "      |\n" +
                "      |\n" +
                "=========");
        man.add("  +---+\n" +
                "  |   |\n" +
                "  O   |\n" +
                " /|   |\n" +
                "      |\n" +
                "      |\n" +
                "=========");
        man.add("  +---+\n" +
                "  |   |\n" +
                "  O   |\n" +
                " /|\\  |\n" +
                "      |\n" +
                "      |\n" +
                "=========");
        man.add("  +---+\n" +
                "  |   |\n" +
                "  O   |\n" +
                " /|\\  |\n" +
                " /    |\n" +
                "      |\n" +
                "=========");
        man.add("  +---+\n" +
                "  |   |\n" +
                "  O   |\n" +
                " /|\\  |\n" +
                " / \\  |\n" +
                "      |\n" +
                "=========");
    }

    /**
     * This gets the number of lives left and outputs a matching man being hanged
     * @param lives The number of lives
     * @return The graphics of the man
     */
    public static String getMan(int lives) {
        if (lives <= 6) {
            return man.get(6 - lives);
        }
        else {
            return man.get(0); // If you have too many lives left, it returns a man not being hanged
        }
    }
}
