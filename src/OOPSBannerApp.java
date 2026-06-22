public class OOPSBannerApp {

    /**
     * Inner static class to store character and pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates character pattern mappings
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[]{

                new CharacterPatternMap('O', new String[]{
                        "  *****  ",
                        " **   ** ",
                        "**     **",
                        "**     **",
                        "**     **",
                        " **   ** ",
                        "  *****  "
                }),

                new CharacterPatternMap('P', new String[]{
                        "*******  ",
                        "**    ** ",
                        "**    ** ",
                        "*******  ",
                        "**       ",
                        "**       ",
                        "**       "
                }),

                new CharacterPatternMap('S', new String[]{
                        " ******  ",
                        "**       ",
                        "**       ",
                        " *****   ",
                        "      ** ",
                        "      ** ",
                        " ******  "
                })
        };
    }

    /**
     * Returns pattern for given character
     */
    public static String[] getCharacterPattern(
            char ch,
            CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {

            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return new String[7];
    }

    /**
     * Prints banner message
     */
    public static void printMessage(
            String message,
            CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern =
                        getCharacterPattern(ch, charMaps);

                line.append(pattern[row]).append(" ");
            }

            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps =
                createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}