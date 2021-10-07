import java.util.*;

public class test7 {
    public static void main(String[] args) {
        System.out.println("输入月份");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt()/3;
        switch (num){
            case 0 :
                System.out.println("现在是冬季");
                break;
            case 1 :
                System.out.println("现在是春季");
                break;
            case 2 :
                System.out.println("现在是夏季");
                break;
            case 3 :
                System.out.println("现在是秋季");
                break;
            case 4 :
                System.out.println("现在是冬季");
            }
        
    }
}
