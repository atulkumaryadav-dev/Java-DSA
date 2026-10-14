public class basic2d{
    public static void main(String[] args) {

        int[][] arr= {{1,2,3,4},{2,4,6,8},{90,98,100,87}};
        System.out.println(arr.length+" "+arr[0].length);


        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}