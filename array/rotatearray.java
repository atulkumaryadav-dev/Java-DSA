public class rotatearray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 8, 100, 17};
         int n=arr.length;
         int i=0,j=n-1,r=3;

         reverse(arr, 0, r-1);
         reverse(arr, r, n-1);
         reverse(arr, 0, n-1);

      for(int ele:arr){System.out.print(ele+" ");} 
       
    }
    public static void reverse(int[] arr, int i , int j){

       
         while (i <= j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
