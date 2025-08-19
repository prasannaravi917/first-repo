import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System .out.println("enter n value: ");
        int a=sc.nextInt();
        for (int i=0;i<=a;i++ ){
            for(int k=0;k<=a;k++){
                System.out.printf("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.printf("* ");
            }
                System.out.println();
        }
        for(int k=0;k<=a;k++){
                System.out.printf(" *");
            }
            System.out.println();
       for (int i=a;i>=1;i-- ){
           for(int k=0;k<=a;k++){
                System.out.printf("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.printf("* ");
            }
                System.out.println();
        }
    }
}