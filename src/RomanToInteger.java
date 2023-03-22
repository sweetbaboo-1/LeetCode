/**
 * Really poor speed.
 * All the s = s.replaceAll() is really slow
 * Could fix this by calculating the number with a single pass by checking each key char
 * {V, X, L, C, D, M} and seeing if the char previous or following changes it in some way
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        s = s.replaceAll("IV", "IIII");
        s = s.replaceAll("IX", "VIIII");
        s = s.replaceAll("XL", "XXXX");
        s = s.replaceAll("XC", "LXXXX");
        s = s.replaceAll("CD", "CCCC");
        s = s.replaceAll("CM", "DCCCC");
        int n = 0;
        for (char c: s.toCharArray()) {
            switch (c) {
                case 'I':
                    n += 1;
                    break;
                case 'V':
                    n += 5;
                    break;
                case 'X':
                    n += 10;
                    break;
                case 'L':
                    n += 50;
                    break;
                case 'C':
                    n += 100;
                    break;
                case 'D':
                    n += 500;
                    break;
                case 'M':
                    n += 1000;
                    break;
            }
        }
        return n;
    }
}
