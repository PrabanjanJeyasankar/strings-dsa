public class ReverseStringWords {
    public static void main(String[] args) {
        String testCase1 = "one two three";
        System.out.println(reverseWordsRecursively(testCase1));

        String testCase2 = "I love india";
        System.out.println(reverseWordsRecursively(testCase2));

        String testCase3 = "hello";
        System.out.println(reverseWordsRecursively(testCase3));

        String testCase4 = "  leading and trailing  ";
        System.out.println(reverseWordsRecursively(testCase4));

        String testCase5 = "I  love   coding";
        System.out.println(reverseWordsRecursively(testCase5));

        String testCase6 = "Hello, World!";
        System.out.println(reverseWordsRecursively(testCase6));

        String testCase7 = "@special #characters $and *symbols";
        System.out.println(reverseWordsRecursively(testCase7));

        String testCase8 = "123 4567 abc def";
        System.out.println(reverseWordsRecursively(testCase8));

    }

    private static String reverseWordsRecursively(String input) {
        // to remove leading & trailing spaces
        input = input.trim();
        int indexOfSpace =  input.indexOf(" ");

        //if there are no spaces, return the string as the last word
        if(indexOfSpace == -1){
            return input;}

        String firstWord = input.substring(0, indexOfSpace);
        String restOfTheString = input.substring(indexOfSpace + 1);

        String restOfTheStringToBeReversed = reverseWordsRecursively(restOfTheString);
        return restOfTheStringToBeReversed + " " + firstWord;
    }
}
