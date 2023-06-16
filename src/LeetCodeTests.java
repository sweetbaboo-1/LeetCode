import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LeetCodeTests {
    private static final Printer printer = new Printer();

    @Test
    public void testTwoSum_pass() {
        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.twoSum_O_n(new int[]{1,2,3,4,5,6}, 10);
        Assertions.assertNotNull(answer);
        Assertions.assertArrayEquals(answer, new int[]{3, 5});
    }

    @Test
    public void testReverseString_pass() {
        ReverseString reverseString = new ReverseString();
        char[] ans = reverseString.reverseString(new char[]{'a','b','c','d','e'});
        printer.print(ans);
    }

    @Test
    public void testPalindromeNumber_pass() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertTrue(palindromeNumber.isPalindrome(100030001));
        Assertions.assertTrue(palindromeNumber.isPalindrome(1));
        Assertions.assertTrue(palindromeNumber.isPalindrome(11));
        Assertions.assertTrue(palindromeNumber.isPalindrome(111));
        Assertions.assertTrue(palindromeNumber.isPalindrome(123404321));
        Assertions.assertTrue(palindromeNumber.isPalindrome(0));
    }

    @Test
    public void testPalindromeNumber_fail() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assertions.assertFalse(palindromeNumber.isPalindrome(10));
        Assertions.assertFalse(palindromeNumber.isPalindrome(100));
        Assertions.assertFalse(palindromeNumber.isPalindrome(32));
        Assertions.assertFalse(palindromeNumber.isPalindrome(123));
        Assertions.assertFalse(palindromeNumber.isPalindrome(323221323));
    }

    @Test
    public void testRomanToInteger_pass() {
        RomanToInteger romanToInteger = new RomanToInteger();
        Assertions.assertEquals(romanToInteger.romanToInt("I"), 1);
        Assertions.assertEquals(romanToInteger.romanToInt("II"), 2);
        Assertions.assertEquals(romanToInteger.romanToInt("III"), 3);
        Assertions.assertEquals(romanToInteger.romanToInt("IV"), 4);
        Assertions.assertEquals(romanToInteger.romanToInt("V"), 5);
        Assertions.assertEquals(romanToInteger.romanToInt("LVIII"), 58);
        Assertions.assertEquals(romanToInteger.romanToInt("MCMXCIV"), 1994);
    }

    @Test
    public void testLongestCommonPrefix_pass() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        Assertions.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        Assertions.assertEquals("flo", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flo"}));
        Assertions.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow",""}));
        Assertions.assertEquals("flower", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flower","flower"}));
    }

    @Test
    public void testValidParenteses_pass() {
        IsValidParentheses validParentheses = new IsValidParentheses();
        Assertions.assertTrue(validParentheses.isValid("()"));
        Assertions.assertTrue(validParentheses.isValid("{}"));
        Assertions.assertTrue(validParentheses.isValid("[]"));
        Assertions.assertTrue(validParentheses.isValid("(({{[[]]}}))"));
        Assertions.assertTrue(validParentheses.isValid("(){}[]"));
    }

    @Test
    public void testValidParenteses_fail() {
        IsValidParentheses validParentheses = new IsValidParentheses();
        Assertions.assertFalse(validParentheses.isValid("({[)}]"));
        Assertions.assertFalse(validParentheses.isValid("({[)}"));
        Assertions.assertFalse(validParentheses.isValid("((((((((("));
        Assertions.assertFalse(validParentheses.isValid(")))))))))"));
        Assertions.assertFalse(validParentheses.isValid("("));
        Assertions.assertFalse(validParentheses.isValid("{"));
        Assertions.assertFalse(validParentheses.isValid("["));
    }


}
