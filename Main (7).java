import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        String d=(a>b && a>c)?"a is greatest":(b>a && b>c)?"b is greatest":"c is greatest";
        System.out.print(d);
    }
    
}

