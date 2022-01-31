import java.io.IOException;

public class Test {
    public long sum(int[] a) throws IOException{
        int hap = 0;

        for(int i=0; i<a.length; i++){
            hap += a[i];
        }

        return hap;
    }
}
