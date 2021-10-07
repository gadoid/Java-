import java.util.*;
public class home {
    public static void main(String[] args) {
        logticket lt = new logticket();
        Scanner input = new Scanner(System.in);
        boolean tag = true ;
        while (tag){
            System.out.println("--------------家庭收支记账软件------------");
            System.out.println("--------------1. 收支明细    -------------");
            System.out.println("--------------2. 登记收入    -------------");
            System.out.println("--------------3. 登记支出    -------------");
            System.out.println("--------------4. 退出软件    -------------");
            System.out.println("                                         ");
            System.out.println("--------------请选择（1-4）：-------------");
            int number = input.nextInt();
            switch (number){
                case 1 :
                    lt.check();
                    break;
                case 2 :
                    lt.in();
                    break;
                case 3 :
                    lt.out();
                    break;
                case 4 :
                    tag = false;
            }
        }
    }
}
class logticket{
    ArrayList <notes> list = new ArrayList<>();
    notes noteinfo ;
    amount amountnum = new amount();

    public void check(){
        System.out.println("收支\t账户金额\t收支金额\t备注");
        for(notes ins : list){
            System.out.println(ins);
        }
    }
    
    public void in(){
        Scanner input = new Scanner(System.in);
        System.out.println("输入事由：");
        String thing = input.next(); 
        System.out.println("输入金额：");
        int money = input.nextInt();
        System.out.println("输入事由：");
        String info = input.nextLine();
        notes n1 = new notes(thing,amountnum,money,info) ;
        n1.plusMoney();
        list.add(n1);
    }

    public void out(){
        Scanner input = new Scanner(System.in);
        System.out.println("输入事由：");
        String thing = input.next(); 
        System.out.println("输入金额：");
        int money = input.nextInt();
        System.out.println("输入事由：");
        String info = input.nextLine();
        notes n1 = new notes(thing,amountnum,money,info) ;
        n1.minsMoney();
        list.add(n1);
    }
}

class notes{
    String thing ;
    amount amountnum;
    double account = 0 ;
    double money ;
    String info ;
    notes(String thing ,amount amount1,double money,String info )
    {
        this(thing,amount1,money);
        this.info = info; 
    }
    notes(String thing ,amount amount1,double money)
    {
        this.thing = thing ;
        this.amountnum = amount1;
        this.info = null;
        this.money = money ;
    }
    @Override
    public String toString(){
        return this.thing +"    "+ this.account +"          "+ this.money +"     "+ this.info;
    }
    public String getThing() {
        return thing;
    }
    public void setThing(String thing) {
        this.thing = thing;
    }
    public double addAccount() {
        return amountnum.addCard(this.money);
    }
    public double getAccount() {
        return amountnum.getCard();
    }
    public void plusMoney() {
        this.account = amountnum.addCard(this.money);

    }
    public void minsMoney() {
        this.money = -money;
        this.account = amountnum.minsCard(this.money);
        System.out.println(this.account);
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}


class amount {
    double card = 0 ;
    public double addCard(double money) {
        this.card += money;
        return this.card;
    }
    public double minsCard(double money){
        this.card += money;
        if (this.card < 0){
            this.card+=money;
            System.out.println("余额不足，无法扣除");
            return -1;
        }
        return this.card;
    }
    public double getCard() {
        return card;
    }
    public void setCard(double card) {
        this.card = card;
    }
}