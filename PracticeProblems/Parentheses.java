import java.util.Scanner;
import java.util.Stack;

public class Parentheses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the string (Type exit to end execution):");
            String input = scanner.next();

            if (input.equals("exit")) {
                break;
            }

            if (check(input)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }

            System.out.println();
        }

        scanner.close();
    }

    private static boolean check(String input) {

        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '(':
                    characterStack.push('(');
                    break;
                case '[':
                    characterStack.push('[');
                    break;
                case '{':
                    characterStack.push('{');
                    break;
                case ')':
                    if (!characterStack.empty() && characterStack.peek() == '(') {
                        characterStack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (!characterStack.empty() && characterStack.peek() == '[') {
                        characterStack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (!characterStack.empty() && characterStack.peek() == '{') {
                        characterStack.pop();
                    } else {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }

        return characterStack.empty();
    }
}