import java.util.Scanner;
public class neonNumber {
    public static void main(String[] args){
        int a;
        int b;
        int product;
        //int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n= sc.nextInt();
        product=n*n;
        a=product%10;
        b=product/10;
        if (n == (a + b)) {
            System.out.println(" It is a neon Number ");
        }
        else{
            System.out.println("It is not a neon number");
        }
    }
}
