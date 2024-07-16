import java.util.*;

public class Infix2Prefix {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();

        sc.close();

        Queue<String> operands = new LinkedList<>();
        Stack<String> operators = new Stack<>();

        int n = expression.length();

        for(int i = 0; i < n; i++){
            char ch = expression.charAt(i);

            if(ch == '+' || ch == '*' || ch == '+' || ch == '-'){
                operators.push(Character.toString(ch));
            }
            else if(ch == '(' || ch == ')'){
                continue;
            }
            else{
                String a = Character.toString(ch);
                operands.add(a);
            }
            }


            StringBuilder res = new StringBuilder();

            while(operators.isEmpty() == false){
                res.append(operators.pop());
            }

            while(operands.isEmpty() == false){
                res.append(operands.poll());
            }

            System.out.println(res.toString());
        }

}

