import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int x =1;

        for(int i=n;i>0;i--){

            x=x*i;
            
        }
        System.out.println(x);
    }
    
}
