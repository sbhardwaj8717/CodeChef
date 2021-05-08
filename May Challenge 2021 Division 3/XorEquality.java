// problem 3 ::- https://www.codechef.com/MAY21C/problems/XOREQUAL

// ============================
// ||   Answer = pow(2,N-1)  ||
// ============================  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XorEquality {
    public static void main(String[] args) throws IOException {
        
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine().trim());

        while(test-->0){
            int N = Integer.parseInt(br.readLine().trim());

            long x =2;
            long y = N-1;
            long result = 1;
            while (y>0) {
                if (y%2 == 1) {
                    result = (x*result) %1000000007;
                }
                x = (x*x)%1000000007;
                y=y/2;
            }
            System.out.println(result);
        }
    }
    
}
