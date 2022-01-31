import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ox {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] array = new int[num];

        for(int i=0; i<num; i++){
            String answer = br.readLine();        
            int flag = 0;
            int hap = 0;

            for(int j=0; j<answer.length(); j++){
                if(answer.charAt(j) == 'O'){
                    flag++;
                }else{
                    flag = 0;
                }
                hap += flag;
            }

            array[i] = hap;
        }

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
