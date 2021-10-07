import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        String grades ;
        System.out.println("请输入你的成绩："); 
        Scanner input = new Scanner(System.in);
        String content = input.nextLine();
        input.close();
        int num = Integer.parseInt(content);
        if (num>99)
        {
            System.out.println("奖励一辆BMW");
        }
        else if (num>80)
        {
            System.out.println("奖励XS MAX");
        }
        else if (num>60)
        {
            System.out.println("iPAD");
        }
        else
        {
            System.out.println("nothing");
        }
        
    }

}
