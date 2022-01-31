import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remainer {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[42];
        int num = 0;

        for(int i=0; i<10; i++){
            int index = (Integer.parseInt(br.readLine())%42);
            array[index]++;
        }

        for(int i=0; i<array.length; i++){
            if(array[i] != 0){
                num++;
            }
        }

        System.out.println(num);
    }
}
