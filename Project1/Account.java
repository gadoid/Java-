public class Account{
    private int id ;
    private double balance ;
    private double annualInterestRate;
    public Account (int id , double balanc , double annualInterestRate){
        this.id = id ;
        this.balance = balanc ;
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw (double amount){
        if(this.balance < amount){
            System.out.println("余额不足，请重新输入！");
        }
        else {
            this.balance-=amount;
            System.out.println("提取成功，当前余额："+this.balance);
        }
    }

    public void deposit(double amount){
        this.balance += amount ;
        System.out.println("成功存入"+amount+"元，当前账户余额："+this.balance);
    }
    @Override
    public String  toString(){
        return this.id+"客户 余额为： "+this.balance;
    }
    
}