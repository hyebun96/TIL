import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split("");
        int hap = 0;

        for(int i=array.length-1; i>=0; i--){
            
            int value = first*Integer.parseInt(array[i]);
            System.out.println(value);
            hap += value * Math.pow(10, (array.length-i-1));
        }

        System.out.println(hap);
    }
}
