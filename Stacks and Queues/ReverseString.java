import java.util.*;

public class ReverseString {

    static void printReverse(String s){
        Stack<Character> stack = new Stack<>();

        int n = s.length();
        int i;

        StringBuilder rstr = new StringBuilder();

        for(i=0;i<n;i++){
            stack.push(s.charAt(i));
        }

        while(!stack.isEmpty()){
            rstr.append(stack.pop());
        }

        System.out.println(rstr);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        sc.close();

        printReverse(str);
    }
}
