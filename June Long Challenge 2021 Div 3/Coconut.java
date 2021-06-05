import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1. Summer Heat 
// https://www.codechef.com/JUNE21C/problems/COCONUT

public class Coconut {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine().trim());
        while (t-->0) {
            String[] str = br.readLine().split(" ");

            int i =0;
            int [] arr = new int[4];
            for (String string : str) {
                arr[i] = Integer.parseInt(string);
                i++;        
            }
            System.out.println((int)Math.ceil(arr[2]/arr[0]) +(int)Math.ceil( arr[3]/arr[1]));

        }
        
    }       
}