public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String testCase1 = "dfsmadamx"; // Example with a palindrome in the middle
        String testCase2 = "madam"; // Example with the whole string being a palindrome
        String testCase3 = "a"; // Single character
        String testCase4 = ""; // Empty string

        System.out.println("Longest palindromic substring in \"" + testCase1 + "\": " + findLongestPalindrome(testCase1));
        System.out.println("Longest palindromic substring in \"" + testCase2 + "\": " + findLongestPalindrome(testCase2));
        System.out.println("Longest palindromic substring in \"" + testCase3 + "\": " + findLongestPalindrome(testCase3));
        System.out.println("Longest palindromic substring in \"" + testCase4 + "\": " + findLongestPalindrome(testCase4));
    }

    private static String findLongestPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        String longestPalindrome = input.substring(0, 1);

        for (int iterator = 0; iterator < input.length(); iterator++) {
            String oddLengthPalindrome = expandAroundCenter(input, iterator, iterator);
            String evenLengthPalindrome = expandAroundCenter(input, iterator, iterator + 1);

            if (oddLengthPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = oddLengthPalindrome;
            }
            if (evenLengthPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = evenLengthPalindrome;
            }
        }

        return longestPalindrome;
    }

    private static String expandAroundCenter(String input, int leftPointer, int rightPointer) {
        while (leftPointer >= 0 && rightPointer < input.length() && input.charAt(leftPointer) == input.charAt(rightPointer)) {
            leftPointer--;
            rightPointer++;
        }
        return input.substring(leftPointer + 1, rightPointer);
    }
}
