import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//   problem 2::- https://www.codechef.com/MAY21C/problems/LKDNGOLF

public class Golf {
    public static void main(String[] args) throws IOException {
        
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine().trim());

        while(test-->0){
            String inStr[] = br.readLine().trim().split(" ");
            long N =  Integer.parseInt(inStr[0]);
            long x =  Integer.parseInt(inStr[1]);
            long k =  Integer.parseInt(inStr[2]);

            // LOGIC IS HERE
            if( x%k==0 || (N + 1 - x)%k ==0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
