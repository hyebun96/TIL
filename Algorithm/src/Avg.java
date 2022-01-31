import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Avg {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            String[] student = br.readLine().split(" ");
            int sum = 0;
            Double avg = 0.0;
            Double major = 0.0;

            for(int j=1; j<student.length; j++){
                sum += Double.parseDouble(student[j]);
            }

            avg = sum/(Double.parseDouble(student[0]));

            for(int j=1; j<student.length; j++){
                if(Double.parseDouble(student[j]) > avg){
                    major++;
                }
            }

            Double pie = major/Double.parseDouble(student[0])*100;
            System.out.println(String.format("%.3f", pie) + "%");
        }

        br.close();
    }
}
