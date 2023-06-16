import java.util.Stack;

public class IsValidParentheses {
    public boolean isValid(String s) {
        if (s.length() == 0)
            return true;
        if (s.length() < 2)
            return false;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.size() == 0)
                    return false;
                char top = stack.pop();
                if (top == '(' && c == ')') {
                    continue;
                }
                if (top == '{' && c == '}') {
                    continue;
                }
                if (top == '[' && c == ']') {
                    continue;
                }
                return false;
            }
        }
        return stack.empty();
    }
}
