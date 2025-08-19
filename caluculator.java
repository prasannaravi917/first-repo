import java.util.Scanner;
public class caluculator{
    void add(int a,int b){
        System.out.println("abbition of a and b :"+(a+b));
    }
    void sub(int a,int b){
        System.out.println("subtraction of a and b :"+(a-b));
    }
    void multiply(int a,int b){
        System.out.println("multiplication of a and b :"+(a*b));
    }
    //public static void main(Static[]args)
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System .out.println("enter values of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        caluculator obj = new caluculator();
        obj.add(a,b);
        obj.sub(a,b);
        obj.multiply(a,b);

    }
}


