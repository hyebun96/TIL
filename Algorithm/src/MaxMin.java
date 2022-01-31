import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMin {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int max = Integer.parseInt(array[0]);
        int min = Integer.parseInt(array[0]);

        for(int i=1; i<num; i++){
            int index = Integer.parseInt(array[i]);

            if(max < index){
                max = index;
            }else if(min > index){
                min = index;
            }
        }

        System.out.println(min + " " + max);
    }
}
