import java.util.Scanner;

public class magnitudecompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int y = Math.abs(n);

        if(y>69){System.out.println("Bada hai 69 se");}
        else {
            System.out.println("Chota hai 69 se");
        }
    }
    
}
