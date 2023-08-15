import java.util.*;
public class Student{
    String name;
    long contc_no;
    int Roll_no;
    String Email;
    int marks1;
    int marks2;
    int marks3;
    int marks4;
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your namee");
        name=sc.nextLine();
        System.out.print("Enter your email");
        Email=sc.nextLine();
        System.out.print("Enter your roll_no");
        Roll_no=sc.nextInt();
        System.out.print("Enter your marks");
        marks1=sc.nextInt();
        marks2=sc.nextInt();
        marks3=sc.nextInt();
    }
    void display(){
        System.out.println(name);
        System.out.println(Email);
        System.out.println(Roll_no);
        System.out.println(marks1);
        System.out.println(marks2);
        System.out.println(marks3);
        System.out.println(marks4);
        
    }
    public static void main(String args[]){
        Student s=new Student();
        s.get();
        s.display();
    }
    
}