import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        
        
         Scanner sc = new Scanner(System.in);

         //size input...................
        System.out.print("Enter the size : ");
        int n =sc.nextInt();

        int [] arr = new int[n];
        //element input.....................
        System.out.print("Enter the array element : ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int target = 10;

        //output....................
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){

                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                }
            }
          
        }
    }
    
}
