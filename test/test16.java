public class test16 {
    public static void main(String[] args) {
        int[][] yh = new int[10][];
        for (int i = 0 ; i < yh.length ; i++){
            yh[i] = new int[i+1];
        }
        for (int i = 0 ; i < yh.length ; i++){
            if (i == 0) {yh[i][0] = 1 ;}
            else {
                for (int j = 0 ; j < yh[i].length ; j++){
                    if (j == 0 | j== yh[i].length-1){
                        yh[i][j] = 1;
                    }
                    else {
                        yh[i][j] = yh[i-1][j-1]+yh[i-1][j];
                    }
                }
            }
        }
        for (int i = 0 ; i < yh.length ; i++){
            for (int j = 0 ; j < yh[i].length ; j++){
                System.out.print(yh[i][j]+" ");
            }
            System.out.println();
        }
    }
}
