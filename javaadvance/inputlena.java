import java.util.Scanner;

public class inputlena {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first no: ");
        int x = sc.nextInt();

        
        System.out.print("Enter second no: ");
        int y = sc.nextInt();

        int z = x+y;
        System.out.println("Required sum = "+z);
    }
    
}
