import java.util.Scanner;

public class diffseries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);

            if (n - i + 1 > 0) {
                System.out.println(n - i + 1);
            }
        }

    }

}
