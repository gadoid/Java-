import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        int single = 0;
        int even = 0 ;
        Scanner input = new Scanner(System.in);
        while(true){
            int number = input.nextInt();
            if (number!=0)
            {
                if(number%2==0){
                    even+=1;
                }
                else{
                    single+=1;
                }
            }
            else{
                break;
            }
        }
        System.out.println("输入奇数"+single+"个,输入偶数"+even+"个");
    }    
}
