import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if (a%3==0 && a%5==0)
        System.out.print("no. divisible by 3 and 5");
        else
        System.out.print("not div");
    }
    
}
