import java.util.*;
public class test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("输入字符");
            String content = input.next();
            char a = content.charAt(0);
            char b = (char)(a-32);
            System.out.println(b);
    }    
}
}
