import java.util.Scanner;

public class maximumelement {
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

        int max= arr[0];

        //output....................
        for(int i =0;i<arr.length;i++){
          
           if(arr[i]>max){max=arr[i];}
        }
        System.out.println("Required maximum element is : "+max);
    }
    
}
