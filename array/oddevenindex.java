import java.util.Scanner;

public class oddevenindex {
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

        //output....................
        for(int i =0;i<arr.length;i++){
          
           if(i%2==0){System.out.print(arr[i]+10+" ");}
           else{System.out.print(arr[i]*2+" ");}
        }
       
    }
    
}
