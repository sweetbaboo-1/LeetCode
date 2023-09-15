import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LeetCodeTests {
    private static final Printer printer = new Printer();

    @Test
    public void testTwoSum_pass() {
        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.twoSumTwoPointer(new int[]{2,5,5,11}, 10);
        printer.print(answer);
//        Assertions.assertNotNull(answer);
//        Assertions.assertArrayEquals(answer, new int[]{1, 3});

//        answer = twoSum.twoSumTwoPointer(new int[]{3,2,4}, 10);


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

    @Test
    public void testMergeSortedList_pass() {
        MergeSortedList mergeSortedList = new MergeSortedList();
        MergeSortedList.ListNode list1 = new MergeSortedList.ListNode(1, new MergeSortedList.ListNode(3, new MergeSortedList.ListNode(5)));
        MergeSortedList.ListNode list2 = new MergeSortedList.ListNode(2, new MergeSortedList.ListNode(4, new MergeSortedList.ListNode(6)));
        MergeSortedList.ListNode result = mergeSortedList.mergeTwoLists(list1, list2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    @Test
    public void testRemoveDuplicatesFromSortedArray_pass() {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 4, 4, 5};
        removeDuplicatesFromSortedArray.removeDuplicates(nums);
        for (int num : nums) System.out.println(num);
    }

    @Test
    public void AllOne_test() {

        AllOne allOne = new AllOne();
        String[] cmds = new String[] {"AllOne","inc","inc","inc","inc","inc","dec","getMaxKey","getMinKey","inc","inc","inc","getMaxKey","getMinKey","inc","inc","getMinKey"};
        String[] args = new String[] {"","hello","hello","world","world","hello","world","","","world","world","leet","","","leet","leet",""};

        for (int i = 0; i < cmds.length; i++) {
            String s = cmds[i];
            if (s.equals("inc")) {
                allOne.inc(args[i]);
            } else if (s.equals("dec")) {
                allOne.dec(args[i]);
            } else if (s.equals("getMaxKey")) {
                System.out.println(allOne.getMaxKey());
            } else if (s.equals("getMinKey")) {
                System.out.println(allOne.getMinKey());
            }
        }
    }

    @Test
    public void ReverseLinkedList_test() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ReverseLinkedList.Node n1 = new ReverseLinkedList.Node(1);
        ReverseLinkedList.Node n2 = new ReverseLinkedList.Node(2);
        ReverseLinkedList.Node n3 = new ReverseLinkedList.Node(3);
        ReverseLinkedList.Node n4 = new ReverseLinkedList.Node(4);
        ReverseLinkedList.Node n5 = new ReverseLinkedList.Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

//        while (n1 != null) {
//            System.out.println(n1.val);
//            n1 = n1.next;
//        }

        ReverseLinkedList.Node n = ReverseLinkedList.reverseListRecursive(n1);
        while (n != null) {
            System.out.println(n.val);
            n = n.next;
        }
    }
}
