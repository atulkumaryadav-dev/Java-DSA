public class alphabettrihorizflipp {
    public static void main(String[] args) {
        for(int i =1;i<=4;i++){
            for(int j =1;j<=5-i;j++){ //n+1-i...................
                System.out.print((char)(96+j)+" ");
             
            }
            System.out.println();
        }
    }
    
}
