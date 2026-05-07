////////////////////////////////////////////////////////////////////
// MARCO BOLLETTIN 2147955
// DAVID SIRBU 2137981
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Map;
import java.util.HashMap;

public class RomanPrinter {

    private static final int HEIGHT = 6;

    private static final Map<Character, String[]> FONT = new HashMap<>();

    static {
        // I
        FONT.put('I', new String[]{
            "  ___ ",
            " |_ _|",
            "  | | ",
            "  | | ",
            " |___|",
            "      "
        });
        // V
        FONT.put('V', new String[]{
            " __     __",
            " \\ \\   / /",
            "  \\ \\ / / ",
            "   \\ V /  ",
            "    \\_/   ",
            "          "
        });
        // X
        FONT.put('X', new String[]{
            " __  __",
            " \\ \\/ /",
            "  \\  / ",
            "  /  \\ ",
            " /_/\\_\\",
            "       "
        });
        // L
        FONT.put('L', new String[]{
            "  _     ",
            " | |    ",
            " | |    ",
            " | |___ ",
            " |_____|",
            "        "
        });
        // C
        FONT.put('C', new String[]{
            "   ____ ",
            "  / ___|",
            " | |    ",
            " | |___ ",
            "  \\____|",
            "        "
        });
        // D
        FONT.put('D', new String[]{
            "  ____  ",
            " |  _ \\ ",
            " | | | |",
            " | |_| |",
            " |____/ ",
            "        "
        });
        // M
        FONT.put('M', new String[]{
            "  __  __ ",
            " |  \\/  |",
            " | |\\/| |",
            " | |  | |",
            " |_|  |_|",
            "         "
        });
    }

    public static String print(int num) {
        String roman = IntegerToRoman.convert(num);
        return printAsciiArt(roman);
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int row = 0; row < HEIGHT; row++) {

            StringBuilder line = new StringBuilder();
            
            for (int i = 0; i < romanNumber.length(); i++) {
                
                char ch = romanNumber.charAt(i);
                String[] charRows = FONT.get(ch);
                
                if (charRows != null) {
                    if (i > 0) {
                        line.append("");  // separatore tra caratteri
                    }
                    line.append(charRows[row]);
                }
            }
            result.append(line.toString());
            if (row < HEIGHT - 1) {
                result.append("\n");
            }
        }

        return result.toString();
    }
}
