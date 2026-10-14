public class rowmaxsum {
    public static void main(String[] args) {

        //row with the maximum sum..................
        
        int[][] arr = {{1,2,3,7},{3,4,6,9},{0,1,3,5}};
        int maxsum=0;
        int row=-1;


        for(int i =0;i<arr.length;i++){

            int sum=0;
            for(int j =0;j<arr[0].length;j++){
                sum=sum+arr[i][j];
             }
             
          if(sum>maxsum){
            maxsum=sum;
            row=i;
          }
        }
        System.out.print("maximum sum of element in row : "+row);
        


    }
    
}
