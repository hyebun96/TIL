import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Xthansmall {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        StringTokenizer st = new StringTokenizer(s);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        String[] array = br.readLine().split(" ");

        for(int i=0; i<a; i++){
            if(Integer.parseInt(array[i]) < b ){
                System.out.print(array[i] + " ");
            }
        }
    }
    
}
