import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price : ");
        int cp = sc.nextInt();

        System.out.print("Enter selling price : ");
        int sp = sc.nextInt();

        if(cp>sp){System.out.println("loss of "+(cp-sp));}
        else {System.out.println("gain of "+(sp-cp));}


    }
    
}
