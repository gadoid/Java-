public class test15{
    public static void main(String[] args) {
        int[][] sum = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        int sums = 0 ;
        for (int i = 0 ; i < sum.length ; i++){
            for (int j = 0 ; j < sum[i].length ; j++){
                sums+=sum[i][j];
            }

        }
        System.out.println(sums);
    }
}