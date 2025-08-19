import java.util.Scanner;
public class CollageManagmentSystem {
    void studentdetails(String a ,String b){
        System.out.println("Student name:"+a);
        System.out.println("Student id :"+b);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int choice = 1;
        while (choice==1) {
        System.out.println("enter the details of sudent");
        System.out.print("enter the name of student:");
        String a=sc.nextLine();
        System.out.print("enter the student id :");
        String b=sc.nextLine();
        CollageManagmentSystem obj = new CollageManagmentSystem();
        obj.studentdetails(a,b);
        System.out.print("Do you want to enter another student? (1/0): ");
        choice = sc.nextInt();
        }
    }
}
