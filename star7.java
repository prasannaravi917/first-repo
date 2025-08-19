class star {
    public static void main(String[] args) {
        int a=6;
        for (int i=0;i<=a;i++ ){
            for(int j=6;j>=i;j--){
                System.out.print("   ");
            }
            for(int j=0;j<=i*2;j++){
                if(j==i){
                System.out.printf(" * ");
            }
            }
            for(int j=0;j<=i*2;j++){
                System.out.printf("   ");
            }
            //System.out.println();
            for(int j=0;j<=i*2;j++){
                if(j==i){
                System.out.printf(" * ");
            }
            }
            System.out.println();
        }
    }
}









/*class star {
    public static void main(String[] args) {
        int a=6;
        for (int i=0;i<=a;i++ ){
            for(int j=6;j>=i;j--){
                System.out.print("   ");
            }
            for(int j=0;j<=i*2;j++){
                System.out.printf(" * ");
            }
            System.out.println();
        }
        for (int i=0;i<=a;i++){
            for(int j=0;j<=i;j++){
                System.out.print("   ");
            }
            for(int j=12;j>=i*2;j--){
                System.out.printf(" * ");
            }
            System.out.println();
        }
        
    }
}*/
