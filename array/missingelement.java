public class missingelement {
    public static void main(String[] args) {
        
        int[] arr = {1,2 ,3 ,5};
        int n =arr.length+1;

        int sum=0;
        int reals=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        int z=reals-sum;
        System.out.print("the missing element is : "+z);
    }
    
}
