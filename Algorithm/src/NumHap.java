import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumHap{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int index = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hap =0 ;

        while(st.hasMoreTokens()){
            hap += Integer.parseInt(st.nextToken());
            System.out.println(hap);
        }

        System.out.println(hap);
        br.close();
    }
}
