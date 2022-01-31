import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Alpha {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sumary = br.readLine().split("");
        int[] alphabet = new int[22];

        for(int i=0; i<sumary.length; i++){
            System.out.println();
            int index = Integer.parseInt(sumary[i])-97;
            alphabet[index] = i;
        }

      /*  for(int i=0; i<alphabet.length; i++){
            System.out.print(alphabet[i] + " ");
        }
*/
        br.close();

    }
}