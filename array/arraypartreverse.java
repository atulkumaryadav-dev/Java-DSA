public class arraypartreverse {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int i = 0, j = 2;//we just have to change the value here.....

        while (i <= j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
