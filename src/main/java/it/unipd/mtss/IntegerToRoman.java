////////////////////////////////////////////////////////////////////
// MARCO BOLLETTIN 2147955
// DAVID SIRBU 2137981
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    private static final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    /**
     * Converte un numero intero tra 1 e 1000 nel corrispondente numero romano.
     *
     * @param number il numero da convertire (1 <= number <= 1000)
     * @return la stringa che rappresenta il numero romano
     * @throws IllegalArgumentException se number è fuori range
     */
    public static String convert(int number) {

        if (number < 1 || number > 1000) {

            throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 1000. Ricevuto: " + number);
        }

        StringBuilder roman = new StringBuilder();
        int remaining = number;

        for (int i = 0; i < VALUES.length; i++) {

            while (remaining >= VALUES[i]) {
                
                roman.append(SYMBOLS[i]);
                remaining -= VALUES[i];
            }
        }

        return roman.toString();
    }
}
