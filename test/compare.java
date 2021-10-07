import java.util.*;
public class compare {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int [] numlist = new int[3];
        int num = 3 ;
        int max = 0;
        for (int i = 0 ; i < 3 ; i++)
        {
            System.out.println("请输入数字"+(i+1)+"（还剩"+num+"个数字） : ");
            numlist[i] = (input.nextInt());
        }
        for (int i = 0 ; i < 3 ; i++)
        {
            for (int j = i ; j < numlist.length ; j++)
            {
                if (numlist[j] < numlist[i]){
                    int tmp ;
                    tmp = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = tmp ;
                }
            }
        }
        for(int a : numlist)
        {
            System.out.println(a);
        }

    }
}
