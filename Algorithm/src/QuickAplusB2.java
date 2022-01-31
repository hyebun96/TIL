import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class QuickAplusB2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num; i++){
            String[] array = br.readLine().split(" ");
            bw.write(Integer.parseInt(array[0])+Integer.parseInt(array[1]) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
