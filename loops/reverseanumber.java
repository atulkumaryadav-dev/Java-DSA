import java.util.Scanner;

public class reverseanumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int y = n;

        int r=0;

        while (n!=0) {

            r=r*10;
            r = r + (n % 10);
            n = n / 10;
            

        }

        //orginal and reverse ka sum................
        System.out.println(r+y);
         
    }
    
}
