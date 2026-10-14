public class segregate01 {
    public static void main(String[] args) {
        
        int[] arr = {0,0,1,0,1,1,0,0,0,0,1,0,1};
        int n = arr.length-1;

        int i =0,j=n-1;
        while (i<j) {
            
            if(arr[i]==0 && arr[j]==0){ i++; }
            else if(arr[i]==1 && arr[j]==1){ j--; }
            else if(arr[i]==1 && arr[j]==0){ 
                //swap.......
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
             }

            else if(arr[i]==0 && arr[j]==1){
                i++;
                j--;
            }

        }

        for(int ele:arr){System.out.print(ele+" ");}
    }
    
}
