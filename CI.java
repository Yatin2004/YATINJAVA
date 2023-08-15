import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int P=sc.nextInt();
        int R=sc.nextInt();
        int N=sc.nextInt();
        int T=sc.nextInt();
        int A=P*(1+R/N);
        System.out.print(Math.pow(A,T));
        
    }
    
}
