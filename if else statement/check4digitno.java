import java.util.Scanner;

public class check4digitno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(n>999 && n<10000){System.out.println("4-digit wala hai");}
        else{System.out.println("Nhi hai bc 4-digit ka");}


    }
    
}
