import java.lang.reflect.Array;
import java.util.*;
public class test2 {
    public static void main(String[] args) {
        double [] nums = new double [2];
        Scanner input = new Scanner(System.in);
        int i = 0 ;
        double j = 1 ;
        while (i<2){
            nums[i] = input.nextDouble();
            i++;
        };
        if (nums[0]>10.0&&nums[1]<20.0){
            System.out.println(nums[0]*nums[1]);
        }
        else {
            System.out.println(nums[0]+nums[1]);
        }
    }
}

