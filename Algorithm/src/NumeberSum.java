import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumeberSum {
    public static void main(String[] args) throws IOException{
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        
        int index = Integer.parseInt(sb.readLine());
        String array = sb.readLine();
        int sum = 0;

        for(int i=0; i<index; i++){
            sum += array.charAt(i)-48;
        }

        System.out.println(sum);

        sb.close();
  
    }
}
