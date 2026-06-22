import java.util.HashMap;
import java.util.Map;

/**
 * UC8: Render OOPS Banner using HashMap
 */
public class OOPSBannerApp {

    /**
     * Creates and returns character patterns.
     *
     * @return HashMap containing character patterns
     */
    public static Map<Character, String[]> createCharacterPatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                "  *****  ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "  *****  "
        });

        patterns.put('P', new String[]{
                "*******  ",
                "**    ** ",
                "**    ** ",
                "*******  ",
                "**       ",
                "**       ",
                "**       "
        });

        patterns.put('S', new String[]{
                " ******  ",
                "**       ",
                "**       ",
                " *****   ",
                "      ** ",
                "      ** ",
                " ******  "
        });

        return patterns;
    }

    /**
     * Returns pattern for the given character.
     *
     * @param ch Character to search
     * @param patterns Character pattern map
     * @return Character pattern
     */
    public static String[] getCharacterPattern(
            char ch,
            Map<Character, String[]> patterns) {

        return patterns.get(ch);
    }

    /**
     * Displays banner message.
     *
     * @param message Message to display
     */
    public static void displayBanner(String message) {

        Map<Character, String[]> patterns =
                createCharacterPatterns();

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern =
                        getCharacterPattern(ch, patterns);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line);
        }
    }

    /**
     * Main Method
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        String message = "OOPS";

        displayBanner(message);
    }
}