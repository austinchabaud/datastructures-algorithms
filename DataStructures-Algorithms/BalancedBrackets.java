import java.util.*;

public class BalancedBrackets {

    public static void main(String[] args) {
        String stringOne = "<<>>";
        String stringTwo = "<({})>";
        String stringThree = "<({)}>";

        System.out.println(balancedBrackets(stringOne));
        System.out.println(balancedBrackets(stringTwo));
        System.out.println(balancedBrackets(stringThree));

        String stringFour = "(())";
        String stringFive = "(())))";

        System.out.println(balancedParentheses(stringFour));
        System.out.println(balancedParentheses(stringFive));
    }

    public static boolean balancedParentheses(String s) {
        int numParentheses = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                numParentheses++;
            } else if (c == ')') {
                numParentheses--;
            }

            if (numParentheses < 0) {
                return false;
            }
        }
        return numParentheses == 0;
    }

    public static boolean balancedBrackets(String charString) {
        Map<Character, Character> charMap = Map.of('(', ')', '{', '}', '[', ']', '<', '>');
        Stack<Character> charStack = new Stack<>();

        for (char c : charString.toCharArray()) {
            if (charMap.containsValue(c)) {
                charStack.push(c);
            } else if (charMap.containsKey(c)) {
                if (charStack.isEmpty()) {
                    return false;
                }

                Character mostRecent = charStack.pop();

                if (!mostRecent.equals(charMap.get(c))) {
                    return false;
                }
            }
        }
        return charStack.isEmpty();
    }
}
