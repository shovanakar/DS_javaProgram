import java.util.Scanner;

public class UsingArrayInfixToPostfix {

    private static final int MAX = 20;
    private static char[] stack = new char[MAX];
    private static int top = -1;


    public static boolean isEmpty() {
        return top == -1;
    }

    
    public static boolean isFull() {
        return top == MAX - 1;
    }

    
    public static char peek() {
        return stack[top];
    }

    
    public static char pop() {
        if (isEmpty()) {
            return '\0'; 
        }
        return stack[top--];
    }


    public static void push(char oper) {
        if (isFull()) {
            System.out.println("Stack Full!!!!");
        } else {
            stack[++top] = oper;
        }
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
        }
        return -1;
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

        System.out.println("Postfix expression: " + infixToPostfix(expression));

        scanner.close();
    }
}