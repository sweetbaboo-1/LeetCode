public class Main {

    private static final Printer printer = new Printer();

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.twoSum_O_n(new int[]{1,2,3,4,5,6,7}, 8);
        printer.print(answer);

        ReverseString reverseString = new ReverseString();
        char[] ans = reverseString.reverseString(new char[]{'a','b','c','d','e'});
        printer.print(ans);

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        printer.print(palindromeNumber.isPalindrome(1000030001));

        RomanToInteger romanToInteger = new RomanToInteger();
        printer.print(romanToInteger.romanToInt("MCMXCIV"));
    }
}
