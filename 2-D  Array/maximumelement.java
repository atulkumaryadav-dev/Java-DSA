public class maximumelement {
    public static void main(String[] args) {
        
        int[][] arr={{1,2,3},{10,20,11},{20,34,31}};
        int max=arr[0][0];

         
        //printing the elements.........................
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
           
        }
        System.out.print("the required maximum element is : "+max+" ");
    }
    
}
