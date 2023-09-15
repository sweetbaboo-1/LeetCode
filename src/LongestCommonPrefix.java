public class LongestCommonPrefix {

    /*
    * for each string check the first char, if they all match then increment score by 1
    * as soon as they don't all match return the prefix of length score
    * if score = 0 return ""
     */
    public String longestCommonPrefix(String[] strings) {
        int score = 0;
        int min = Integer.MAX_VALUE;
        for (String s: strings) {
            if (s.length() < min) {
                min = s.length();
            }
        }
        for (int i = 0; i < min; i++) {
            char c = strings[0].toCharArray()[i];
            for (String s: strings) {
                if (c != s.toCharArray()[i]) {
                    return strings[0].substring(0, score);
                }
            }
            score++;
        }
        return strings[0].substring(0, score);
    }
}
