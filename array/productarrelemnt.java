import java.util.Scanner;

public class productarrelemnt {
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

        int product = 1;

        //output....................
        for(int i =0;i<arr.length;i++){
          
            product=product*arr[i];
        }
        System.out.print("required product : "+product+"");
    }
    
}
