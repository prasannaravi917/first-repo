import java.util.Scanner;
class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40,50,60} ;
        System.out.println("Vishnu");
        System.out.println("enter the value to find ");
        int key = sc.nextInt();
        boolean found=false;
        int size=arr.length;
        for(int i=0;i<size;i++){
            if(key==arr[i]){
                System.out.println("the value is found at the index : "+i);
                found=true;
                break;}
            }
        if(found==false)
        {
        System.out.print("Not found");
        }
    }
}
