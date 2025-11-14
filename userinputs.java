import java.util.Scanner;
public class userinputs {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your name");
       String name=sc.nextLine();
       System.out.println("enter your age");
       int age=sc.nextInt();
       System.out.println("enter your grade points");
       Double grades=sc.nextDouble();
       System.out.println("your details:\n"+name+"\n"+age+"\n"+grades);
    }
}
