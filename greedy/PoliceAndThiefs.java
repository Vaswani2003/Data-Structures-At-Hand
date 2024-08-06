package greedy;
import java.util.*;

public class PoliceAndThiefs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i, j, cnt = 0;

        ArrayList<Integer> police = new ArrayList<>();
        ArrayList<Integer> thiefs = new ArrayList<>();

        for(i=0;i<n;i++){
            String s = sc.next();
            if(s.equals("P")) police.add(i);
            else{
                thiefs.add(i);
            }
        }

        int k = sc.nextInt();
        sc.close();
		int p=0, t=0;
      
        while(t<thiefs.size() && p<police.size()){
            if(Math.abs(thiefs.get(t) - police.get(p)) <= k){
            	t++;
                p++;
              cnt++;
            }
          else if(thiefs.get(t) < police.get(p)){
          	t++;
          }
          else{
          	p++;
          }
        }

        System.out.println("Maximum thieves caught: "+cnt);
    }
}
