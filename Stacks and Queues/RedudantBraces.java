import java.util.*;

public class RedudantBraces {
    public static void main(String[] bals){
        Scanner sc = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();

        String expr = sc.next();
        boolean flag = true;
        sc.close();

        int n = expr.length();

        int i;

        for(i=0; i < n; i++){

            char ch = expr.charAt(i);

            if (ch == ')'){
                char top = stack.pop();

                flag = true;

                while(top != '(' && !stack.isEmpty()){
                    if (top == '*' || top == '+' || top == '-' || top == '/'){
                        flag = false;
                    }

                    top = stack.pop();
                }

                if (flag){
                    System.out.println("Yes");
                    break;
                }
            }else{
                stack.push(ch);
            }
            
        }
        if (!flag){
            System.out.println("No");
        }
    }
}
