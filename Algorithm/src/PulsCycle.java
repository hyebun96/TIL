import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PulsCycle {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int firstNum = Integer.parseInt(br.readLine());
        int num = firstNum;
        int cycle = 0;

        while(true){
            int nextNum = (num/10) + (num%10);

            if(nextNum < 10 ){
               num = (num%10)*10 + nextNum;
            }else{
                num = (num%10)*10 + (nextNum%10);
            }
            cycle++;

            if(firstNum == num){
                System.out.println(cycle);
                break;
            }
        }

        br.close();
       
    }
}
