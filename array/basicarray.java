import java.util.Scanner;

public class basicarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking size input...................

        System.out.print("Enter the size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // array element input.................
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // mutability of array.........

        arr[3] = 100;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}