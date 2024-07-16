import java.util.*;

public class ValidParanthesis {
    public static void main(String[] args){
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int n = str.length();

        if(n%2 == 1){
            System.out.println("Not Balanced");
            sc.close();
            return;
        }

        sc.close();

        int i;
        for(i=0; i < n; i++){

            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }

            else if (stack.isEmpty() == false){
                if(ch=='}' && stack.peek() == '{'){
                    stack.pop();
                }
                else if(ch == ']' && stack.peek() == '['){
                    stack.pop();
                }
                else if(ch==')' && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    System.out.println("Not Balanced");
                    break;
                }
            }
            else{
                System.out.println("Not Balanced");
                break;
            }
        }

        if(stack.isEmpty()){
            System.out.println("Balanced");
        }
    }
}
