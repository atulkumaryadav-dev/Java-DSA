import java.util.Scanner;

public class divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(n%5==0 && n%3==0){System.out.println("divisible by 5 and 3 both");}
        else{System.out.println("not divisible by both");}
    }
    
}
