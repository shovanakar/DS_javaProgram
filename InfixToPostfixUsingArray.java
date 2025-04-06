import java.util.Scanner;

public class InfixToPostfixUsingArray {

    private static final int MAX = 100;
    private static char[] stack = new char[MAX];
    private static int top = -1;

    
    public static boolean isFull() {
        return top == MAX - 1;
    }

    
    public static boolean isEmpty() {
        return top == -1;
    }

    
    public static void push(char item) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push.");
            return;
        }
        stack[++top] = item;
    }

    
    public static char pop() {
        if (isEmpty()) {
            return '\0';
        }
        return stack[top--];
    }

    
    public static char peek() {
        if (isEmpty()) {
            return '\0'; 
        }
        return stack[top];
    }

    
    public static boolean checkIfOperand(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    
    public static String reverse(String expression) {
        StringBuilder reversed = new StringBuilder(expression);
        reversed.reverse();
        for (int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);
            if (ch == '(') {
                reversed.setCharAt(i, ')');
            } else if (ch == ')') {
                reversed.setCharAt(i, '(');
            }
        }
        return reversed.toString();
    }

    
    public static String infixToPrefix(String expression) {
        String reversedExpression = reverse(expression);
        String postfix = infixToPostfix(reversedExpression);
        return reverse(postfix);
    }

    
    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            
            if (checkIfOperand(ch)) {
                result.append(ch);
            }
            
            else if (ch == '(') {
                push(ch);
            }
            
            else if (ch == ')') {
                while (!isEmpty() && peek() != '(') {
                    result.append(pop());
                }
                if (!isEmpty() && peek() == '(') {
                    pop();
                }
            }
            
            else {
                while (!isEmpty() && precedence(peek()) >= precedence(ch)) {
                    result.append(pop());
                }
                push(ch);
            }
        }

        
        while (!isEmpty()) {
            result.append(pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter infix expression: ");
        String expression = scanner.nextLine();

        System.out.println("Prefix expression: " + infixToPrefix(expression));

        scanner.close();
    }
}