package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {
    
    @Test
    public void testPrinter_1() {
        assertEquals("  ___ \n" + //
                     " |_ _|\n" + //
                     "  | | \n" + //
                     "  | | \n" + //
                     " |___|\n" + //
                     "      ", RomanPrinter.print(1));
    }

    @Test
    public void testPrinter_3() {
        assertEquals("  ___   ___   ___ \n" + //
                     " |_ _| |_ _| |_ _|\n" + //
                     "  | |   | |   | | \n" + //
                     "  | |   | |   | | \n" + //
                     " |___| |___| |___|\n" + //
                     "                  ", RomanPrinter.print(3));
    }

    @Test
    public void testPrinter_4() {
        assertEquals("  ___  __     __\n" + //
                     " |_ _| \\ \\   / /\n" + //
                     "  | |   \\ \\ / / \n" + //
                     "  | |    \\ V /  \n" + //
                     " |___|    \\_/   \n" + //
                     "                ", RomanPrinter.print(4));
    }

    @Test
    public void testPrinter_5() {
        assertEquals(" __     __\n" + //
                     " \\ \\   / /\n" + //
                     "  \\ \\ / / \n" + //
                     "   \\ V /  \n" + //
                     "    \\_/   \n" + //
                     "          ", RomanPrinter.print(5));
    }

    @Test
    public void testPrinter_9() {
        assertEquals("  ___  __  __\n" + //
                     " |_ _| \\ \\/ /\n" + //
                     "  | |   \\  / \n" + //
                     "  | |   /  \\ \n" + //
                     " |___| /_/\\_\\\n" + //
                     "             ", RomanPrinter.print(9));
    }

    @Test
    public void testPrinter_10() {
        assertEquals(" __  __\n" + //
                     " \\ \\/ /\n" + //
                     "  \\  / \n" + //
                     "  /  \\ \n" + //
                     " /_/\\_\\\n" + //
                     "       ", RomanPrinter.print(10));
    }

    @Test
    public void testPrinter_40() {
        assertEquals(" __  __  _     \n" + //
                     " \\ \\/ / | |    \n" + //
                     "  \\  /  | |    \n" + //
                     "  /  \\  | |___ \n" + //
                     " /_/\\_\\ |_____|\n" + //
                     "               ", RomanPrinter.print(40));
    }

    @Test
    public void testPrinter_50() {
        assertEquals("  _     \n" + //
                     " | |    \n" + //
                     " | |    \n" + //
                     " | |___ \n" + //
                     " |_____|\n" + //
                     "        ", RomanPrinter.print(50));
    }

    @Test
    public void testPrinter_90() {
        assertEquals(" __  __   ____ \n" + //
                     " \\ \\/ /  / ___|\n" + //
                     "  \\  /  | |    \n" + //
                     "  /  \\  | |___ \n" + //
                     " /_/\\_\\  \\____|\n" + //
                     "               ", RomanPrinter.print(90));
    }

    @Test
    public void testPrinter_100() {
        assertEquals("   ____ \n" + //
                     "  / ___|\n" + //
                     " | |    \n" + //
                     " | |___ \n" + //
                     "  \\____|\n" + //
                     "        ", RomanPrinter.print(100));
    }

    @Test
    public void testPrinter_400() {
        assertEquals("   ____   ____  \n" + //
                     "  / ___| |  _ \\ \n" + //
                     " | |     | | | |\n" + //
                     " | |___  | |_| |\n" + //
                     "  \\____| |____/ \n" + //
                     "                ", RomanPrinter.print(400));
    }

    @Test
    public void testPrinter_500() {
        assertEquals("  ____  \n" + //
                     " |  _ \\ \n" + //
                     " | | | |\n" + //
                     " | |_| |\n" + //
                     " |____/ \n" + //
                     "        ", RomanPrinter.print(500));
    }

    @Test
    public void testPrinter_900() {
        assertEquals("   ____   __  __ \n" + //
                     "  / ___| |  \\/  |\n" + //
                     " | |     | |\\/| |\n" + //
                     " | |___  | |  | |\n" + //
                     "  \\____| |_|  |_|\n" + //
                     "                 ", RomanPrinter.print(900));
    }

    @Test
    public void testPrinter_1000() {
        assertEquals("  __  __ \n" + //
                     " |  \\/  |\n" + //
                     " | |\\/| |\n" + //
                     " | |  | |\n" + //
                     " |_|  |_|\n" + //
                     "         ", RomanPrinter.print(1000));
    }
}