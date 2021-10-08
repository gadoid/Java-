import java.util.*;
import java.util.Random;

public class test17 {
public static void main(String[] args) {
    int[] nums = new int[10] ;
    for (int i = 0  ; i < nums.length ; i ++)
    {
        nums[i] = (int)(Math.random()*100);
        System.out.println(nums[i]);
    }
    int sum = 0 ;
    int max = 0 ;
    int min = 0 ;
    for (int j = 0 ; j < nums.length ; j++){
        sum += nums[j];
        max = (max > nums[j]) ? max : nums[j];
        min = (min < nums[j]) ? min : nums[j];
    }
    System.out.print("和为"+sum+"平均值为"+(double)(sum/10)+"最大值为"+max+"最小值为"+min);
}
}
