import java.util.*;

public class test4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int number = rd.nextInt(90)+10;
        System.out.println(number);
        Scanner input = new Scanner(System.in);
        System.out.println("输入选择的号码");
        int customerNumber = input.nextInt();
        if (number==customerNumber)
        {
            System.out.println("10000");
        }
        else if ((customerNumber%10*10+customerNumber/10) == number)
        {
            System.out.println("5000");
        }
        else if (customerNumber%10==number%10 || customerNumber/10 == number/10)
        {
            System.out.println("3000");
        }
        else if (customerNumber%10==number/10 || customerNumber/10 == number%10)
        {
            System.out.println("1000");
        }
        else
        {
            System.out.println("nothing");
        }

    }    

}
