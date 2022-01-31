import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        int[] array = new int[10];

        while(num!=0){
            int index = num%10;
            num = num/10;
            array[index]++;
        }

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
