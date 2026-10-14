public class wavearray {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5};
        int n = arr.length-1;

        int i=0;

        for(i =0;i<arr.length;i+=2){

            if(i==arr.length-1){break;}
            if(arr[i+1]>arr[i]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                
            }
            }
            for(int ele:arr){System.out.print(ele+" ");}

    }
    
}
