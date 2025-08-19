public class pattren1
{
    public static void main(String[]args){
        int a=4;
        for(int i=1;i<=4;i++){
            if(i==1||i==4){
                for(int j=0;j<a;j++){
                    System.out.print("* ");
                }
            }
            if(i==2||i==3){
                    System.out.print("\n");
                    System.out.print("*     *" );
                    if(i==3){
                        System.out.println();
                    }
            }
            /*for(int k=i;k<3;k++){
                System.out.println("*     *");
            }*/
             /*  for (int j = i; j < i + 1 && i != 1 && i != a; j++) {
                System.out.println("*     *");
            }*/
            //System.out.println();
           /*  if(i==4){
                System.out.println();
                for(int j=0;j<4;j++){
                    System.out.print("*");
                }
        }*/
        
    }
    }
}
