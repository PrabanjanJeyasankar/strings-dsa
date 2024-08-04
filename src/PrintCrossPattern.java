public class PrintCrossPattern {
    public static void main(String[] args) {
        String testcase1 = "madam";
        String testcase2 = "abcd";
        String testcase3 = "a";
        String testcase4 = "";
        String testcase5 = "m a d a m";

        printPattern(testcase1);
        System.out.println();
        printPattern(testcase2);
        System.out.println();
        printPattern(testcase3);
        System.out.println();
        printPattern(testcase4);
        System.out.println();
        printPattern(testcase5);
        System.out.println();
    }
    private static void printPattern(String input) {
        int stringLength = input.length();
        if (stringLength == 0) {
            System.out.println("Input is empty.");
            return;
        }
        if (stringLength == 1) {
            System.out.println(input);
            return;
        }
        for (int rowIndex = 0; rowIndex < stringLength; rowIndex++) {
            printRow(input, rowIndex, stringLength);
        }
    }
    private static void printRow(String input, int rowIndex, int stringLength){
        for (int columnIndex = 0; columnIndex < stringLength; columnIndex++) {
            if (columnIndex == rowIndex || columnIndex == stringLength - 1 - rowIndex) {
                System.out.print(input.charAt(columnIndex));
            }
                System.out.print(" ");
        }
        System.out.println();
    }
}









