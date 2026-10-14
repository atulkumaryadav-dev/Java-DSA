public class printelecolwise {
    public static void main(String[] args) {
          int[][] arr = new int[][]{{1, 2, 3, 7}, {3, 4, 6, 9}, {0, 1, 3, 5}};


          //print the element column wise.................................
          for(int i =0;i<arr[0].length;i++){
            for(int j =0;j<arr.length;j++){

                System.out.print(arr[j][i]+" ");//row wise........
            }
            System.out.println();
          }


    }
    
}
