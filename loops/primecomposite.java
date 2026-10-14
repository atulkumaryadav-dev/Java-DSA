import java.util.Scanner;

public class primecomposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        boolean flag=false;

        for(int i = 2;i<n;i++){
            if(n%i==0){
            flag=true;
            break;
            }

        }
        if(flag==true){System.out.println("Composite no. hai");}
        if(flag==false){System.out.println("prime number");}
    }
    
}
