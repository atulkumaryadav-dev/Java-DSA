import java.util.Scanner;

public class perimeterareacomp {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length : ");
        int l = sc.nextInt();

         System.out.print("Enter the breadth : ");
        int b = sc.nextInt();

        int area = l*b;
        int perimeter = 2*(l +b);

        if(area>perimeter){System.out.println("area bada hai");}
        else{System.out.println("perimeter bada hai");}
    }
    
}
