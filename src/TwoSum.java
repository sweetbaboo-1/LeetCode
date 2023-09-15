import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    /*
    iterate through the array,
    for each number n
        determine the number who when summed with n equals the target into a map as the key, and set the value to the index of the array
        check the map to see if that number is already in the map. If so we found solution
        else put the number into the map as specified
     */
    public int[] twoSum_O_n(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int otherHalf = target - numbers[i];
            Integer foo = map.get(numbers[i]);
            if (foo != null) {
                return new int[]{foo, i};
            } else {
                map.put(otherHalf, i);
            }
        }
        return null;
    }

    public int[] twoSum_O_n2(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public int[] twoSumTwoPointer(int[] numbers, int target) {
        // sort the list
        int[] copy = numbers.clone();
        Arrays.sort(numbers);

        int head = 0;
        int tail = numbers.length - 1;
        while (numbers[head] + numbers[tail] != target) {
            if (numbers[head] + numbers[tail] > target) {
                tail--;
            } else {
                head++;
            }
        }
        int x = -1,y = -1;
        for (int i = 0; i < copy.length; i++) {
            if (x == -1 && numbers[head] == copy[i])
                x = i;
            else if (y == -1 && numbers[tail] == copy[i])
                y = i;
        }
        return new int[]{y, x};
    }
}