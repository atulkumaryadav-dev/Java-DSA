import java.util.Scanner;

public class integerornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double n = sc.nextDouble();

        if(n%1==0){System.out.println("INTEGER HAI");}
        else{System.out.println("Not an integer");}
    }
    
}
