import java.util.HashMap;


// TODO: finish
public class ReverseString {
    public char[] reverseString(char[] s) {
        for (int i = 0; i < Math.floor(s.length / 2); i++) {
            swap(s[i], s[s.length - 1 - i]);
        }
        return s;
    }

    public void swap(char s, char ss) {
        HashMap<Integer, Integer> map = new HashMap<>();
        char temp = s;
        s = ss;
        ss = temp;
    }
}
