import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer jame = new Customer("jame","smith");
        while(true){
            System.out.println("账户系统：");
            System.out.println("1.存钱");
            System.out.println("2.取钱");
            System.out.println("3.退出");
              
        int option = input.nextInt();
        switch(option){
            case 1 :
                System.out.println("请输入存款额度：");
                int st = input.nextInt();
                store(jame,st);
                break ;
            case 2 :
                System.out.println("请输入取款额度：");
                int de = input.nextInt();
                draw(jame, de);
                break ;
            case 3 :
                input.close();
                System.exit(0);
        }  
    }
    }
    public static void store(Customer a,double amount){
        a.getAccount().deposit(amount);;
    }
    public static void draw(Customer a , double amount){
        a.getAccount().withdraw(amount);
    }
    
}
