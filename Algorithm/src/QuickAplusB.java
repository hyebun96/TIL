import java.io.*;

public class QuickAplusB{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        for(int i=0; i<num; i++){
            String[] array = br.readLine().split(" ");
            System.out.println(Integer.parseInt(array[0]) +  Integer.parseInt(array[1]));
        }
        
        br.close();
    }
}