import java.util.*;
public class test6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入成绩：");
        int grade = input.nextInt();
        String level = (60<grade) ? "A":"B" ; 
        switch (level) {
            case "A":
                System.out.println("你合格了");
                break;
            case "B":
                System.out.println("对不起，你不合格");
                break;
        }
    }    
}
