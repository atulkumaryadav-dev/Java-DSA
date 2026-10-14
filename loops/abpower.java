import java.util.Scanner;

public class abpower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();
        
        System.out.print("Enter a : ");
        int b = sc.nextInt();

        int z = 1;

        for(int i =1;i<=b;i++){

            z=z*a;
            
        }
        System.out.println(z);

    }
    
}
