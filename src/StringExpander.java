public class StringExpander {
    public static void main(String[] args) {
        System.out.println(expandString("b9c8s3"));
        System.out.println(expandString("a3b2"));
        System.out.println(expandString("123"));
        System.out.println(expandString("a10b20"));
        System.out.println(expandString("z40"));
    }
    public static String expandString(String input) {
        if (input == null || input.isEmpty()) {
            return "Invalid input";
        }
        StringBuilder resultString = new StringBuilder();
        StringBuilder countsToBeRepeated = new StringBuilder();
        char currentCharacter = '\0';
        boolean hasAlphabet = false;

        for(int iterator = 0; iterator < input.length(); iterator++){
            char character = input.charAt(iterator);
            if(isAlphabet(character)){
                appendRepeatedCharacter(resultString, currentCharacter, countsToBeRepeated);
                currentCharacter = character;
                hasAlphabet = true;
            }else if(isDigit(character)){
                countsToBeRepeated.append(character);
            }
        }
        appendRepeatedCharacter(resultString, currentCharacter, countsToBeRepeated);

        if (!hasAlphabet) {
            return "Invalid input";
        }
        return resultString.toString();
    }

    private static boolean isDigit(char character) {
        return ((character >= '0' && character <='9'));
    }

    private static boolean isAlphabet(char character) {
        return ((character >= 'a' && character <='z') || (character >= 'A' && character <='Z'));
    }
    private static void appendRepeatedCharacter(StringBuilder resultString, char currentCharacter, StringBuilder countsToBeRepeated) {
        if(!countsToBeRepeated.isEmpty() && currentCharacter != '\0'){
            int count = parseNumber(countsToBeRepeated);
           resultString.append(String.valueOf(currentCharacter).repeat(Math.max(0, count)));
           countsToBeRepeated.setLength(0);
        }
    }

    private static int parseNumber(StringBuilder countsToBeRepeated) {
        int count = 0;
        for(int iterator = 0; iterator < countsToBeRepeated.length(); iterator++){
            count = count * 10 + (countsToBeRepeated.charAt(iterator) - '0');
        }
        return count;
    }
}









