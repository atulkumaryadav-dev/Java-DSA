import java.util.Scanner;

public class quadrantdecide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter x-coordinate : ");
        int x = sc.nextInt();

        System.out.print("Enter y-coordinate : ");
        int y = sc.nextInt();

 
        if (x>0 && y>0) {System.out.println("First quadrant");}
        else if(x<0 && y>0){System.out.println("second quadrant");}
        else if (x<0 && y<0) {System.out.println("Third quadrant");}
        else{System.out.println("fourth quadrant");}


    }
    
}
