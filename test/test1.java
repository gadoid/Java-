import java.util.*;

public class test1 {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>() ;
        Scanner input = new Scanner(System.in);
        int i = 2 ;
        int j = 0 ;
        while(i>0)
        {
            nums.add(input.nextInt());
            i-- ;
        }
        for(int a : nums ){
            j+=a;
        }
        if (j>=50){
            System.out.println("hello world");
        }
        
    }    
}
