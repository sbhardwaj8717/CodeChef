import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnIntersectingSequence {
    static long findGCD(int a, int b,int k, int i, int sum)   
    {   
    if(i>2*k){
        return sum;
    }
    if (b == 0){
        sum = sum+a;
        i++;
        return findGCD(k+i*i, k+(i+1)*(i+1), k,i,sum);  
    } 
    return findGCD(b, a % b,k,i,sum);   
    }    

    // static long num(int k){
    //     long sum = 0;
    //     int a=0,b =0;
    //     for (int i = 1; i <= 2*k; i++) {
    //         // a =(i+1)*(i+1);
    //         // b =a;
    //         sum += findGCD(k+i*i,k+(i+1)*(i+1));
    //     }
    //     return sum;
    // }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine().trim());

        while(test-->0){
        int k = Integer.parseInt(br.readLine().trim());
        
        long sum = findGCD(k+1,k+4,k,1,0);
        System.out.println(sum);
        }
    }

}
