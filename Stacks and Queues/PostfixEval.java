import java.util.*;

class PostfixEval
{
  static int postfixEval(String expr){
  	 Stack<Integer> stack = new Stack();
    	
        int n = expr.length(); 

        int eval;
        int i;
        for(i = 0; i < n; i++){
            char token = expr.charAt(i);

            if( token == '*' || token == '/' || token == '-' || token == '+'){
                int left = stack.pop();
                int leftmost = stack.pop();
                
                if(token == '*'){
                    eval = leftmost*left;
                }
                else if (token == '/'){
                    eval = leftmost/left;
                }
                else if(token == '+')
                {
                    eval = leftmost + left;
                }
                else{
                    eval = leftmost - left;
                }
                stack.push(eval);
            }
            else{
                stack.push(Integer.parseInt(String.valueOf(token)));
            }
        }

        return stack.pop();
    }
  
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    
    for(int i = 0; i < T; i++){
		String expr = sc.next();
      	System.out.println(postfixEval(expr));
    }
    sc.close();
  }
}