public class minofmaxeleofrow {
    public static void main(String[] args) {

        int[][] arr = new int[][] { { 1, 2, 3, 7 }, { 3, 4, 6, 9 }, { 0, 1, 3, 5 } };

        int minele = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            int maxele = arr[i][0];
            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] > maxele) {
                    maxele = arr[i][j];
                }

            }
            if (maxele < minele) {
                minele = maxele;
            }

        }

        System.out.print("Minimum among the maxele is : " + minele);

    }

}
