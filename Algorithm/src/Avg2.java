import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Avg2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int index = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        double hap = 0;
        int max = 0;

        // 최댓값 구하기
        for(int i=0; i<index; i++){
            int num = Integer.parseInt(array[i]);
            if(max<num){
                max = num;
            }
        }

        // 새로운 평균 구하기
        for(int i=0; i<index; i++){
            hap = hap + Double.parseDouble(array[i])/max*100;
        }

        System.out.println(hap/index);
        br.close();
    }
}
