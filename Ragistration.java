import java.util.*;
public class Ragistration {
    Scanner sc=new Scanner(System.in);
    String fname;
    String lname;
    int age;
    long phone;
    public Ragistration()
    {
        System.out.println("Enter Your first name");
        this.fname=sc.nextLine();
        System.out.println("Enter Your Last name");
        this.lname=sc.nextLine();
        System.out.println("Enter Your Age");
        this.age=sc.nextInt();
        System.out.println("Enter Your mobile number");
        this.phone=sc.nextLong();
    }

    public int Password()
    {
        int start=1000;
        int stop=10000;
        int pass=(int)(Math.random()*(stop-start)+stop);
        return pass;
    }
    public static void main(String args[])
    {
        Ragistration r=new Ragistration();
        int a=r.Password();
        String b=(r.fname).substring(1, 3);
        
        System.out.println("Name: "+r.fname+" "+r.lname);
        System.out.println("Age: "+r.age);
        System.out.println("Mobile : "+r.phone);
        System.out.println("Password : "+b+""+a+""+r.age);
    }
}
