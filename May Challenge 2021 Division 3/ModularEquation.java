import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModularEquation {
    public static void main(String[] args) throws IOException {
        
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine().trim());

        while(test-->0){
            String inStr[] = br.readLine().trim().split(" ");
            int N =  Integer.parseInt(inStr[0]);
            int M =  Integer.parseInt(inStr[1]);
            int count = N-1;
            

            for (int i = 2; i <= N; i++) {
                for (int j = i+1; j <= N; j++) {
                    if ((M%i) == (M%j)%i) {
                        count++;
                    }
                }
                // count += (N -1)/i;
            }
            System.out.println(count);
        }
    }
}
