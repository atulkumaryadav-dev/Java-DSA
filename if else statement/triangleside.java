import java.util.Scanner;

public class triangleside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = sc.nextInt();

        System.out.print("Enter the number : ");
        int b = sc.nextInt();

        System.out.print("Enter the number : ");
        int c = sc.nextInt();

        if(a+b<c && b+c<a && c+a<b){System.out.println("not the triangle sides");}
        else{System.out.println("Are triangle sides");}
    }
    
}
