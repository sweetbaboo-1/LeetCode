public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x >= 0) {
            char[] nums = Integer.toString(x).toCharArray();
            int leftIndex = 0;
            int rightIndex = nums.length - 1;
            while (true) {
                char leftChar = nums[leftIndex];
                char rightChar = nums[rightIndex];
                if (leftChar != rightChar) {
                    return false;
                }
                leftIndex++;
                rightIndex--;
                if (rightIndex - leftIndex < 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
