import java.util.*;

public class Infix2Postfix {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();

        sc.close();

        Stack<String> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int n = expression.length();

        for(int i = 0; i < n; i++){
            char ch = expression.charAt(i);

            if(ch == '+' || ch == '*' || ch == '+' || ch == '-'){
                operators.push(ch);
            }
            else{
                String a = Character.toString(ch);
                operands.push(a);
            }
        }

        while(operators.isEmpty() == false){
            String right = operands.pop();
            String left = operands.pop();

            String expr = left + Character.toString(operators.pop()) + right;

            operands.push(expr);
        }

        System.out.println(operands.pop());
    }
}
