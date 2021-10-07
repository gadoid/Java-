import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入狗狗的年龄："); 
        double dogAge = input.nextDouble();
        double lHumanAge = (dogAge>2)? 4*(dogAge-2) + 21 : 10.5*dogAge; 
        System.out.println(lHumanAge);
    }    
}
