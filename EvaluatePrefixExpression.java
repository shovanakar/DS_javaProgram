import java.util.Stack;

public class EvaluatePrefixExpression {

    
    static boolean isOperand(char c) {
        
        return c >= '0' && c <= '9';
    }

    
    static double evaluatePrefix(String expression) {
        Stack<Double> stack = new Stack<>();

        
        for (int i = expression.length() - 1; i >= 0; i--) {
            char ch = expression.charAt(i);

            
            if (isOperand(ch)) {
                stack.push((double) (ch - '0')); 
            } else {
                
                double operand1 = stack.pop();
                double operand2 = stack.pop();

                
                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        
        return stack.peek();
    }

    
    public static void main(String[] args) {
        String expression = "-+7*45+20"; 

        System.out.println("Prefix Expression: " + expression);
        System.out.println("Evaluated Result: " + evaluatePrefix(expression));
    }
}