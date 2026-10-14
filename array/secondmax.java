public class secondmax {
    public static void main(String[] args) {
        
        int[] arr = {1, 3, 2, 0, 100};
        int max=arr[0];

        for(int i =0;i<arr.length;i++){

            if(arr[i]>max){max=arr[i];}

        }
       
        int secondmax=arr[0];

        for(int i =0;i<arr.length;i++){
            if(arr[i]>secondmax && arr[i]<max){
               
                secondmax=arr[i];
            }
        }
        System.out.print("the secondmaximum element is : "+secondmax);
    }
    
}
