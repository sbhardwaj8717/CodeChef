import java.util.Scanner;

//Problem 1 ::-  https://www.codechef.com/MAY21C/problems/SOLBLTY

public class Solubility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-->0) {
            int x = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int output = (a + (100-x)*b)*10;
            System.out.println(output);
        }
    }
}