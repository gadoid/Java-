import java.util.*;

public class CustomerList {
    private HashSet<Customer> clist = new HashSet<>();
    CustomerList(){
        clist.add(new Customer(1 ,  12 ,"男" ,"张明", "18523895124"  , "@qq.com"));
        clist.add(new Customer(2 ,  34 ,"女" ,"张华" , "18523895124" , "@qq.com"));
        clist.add(new Customer(3 ,  24 ,"男" ,"焦" ,  "18523895124" , "@qq.com"));
        clist.add(new Customer(4 ,  36 ,"女" ,"李瑞" ,  "18523895124" , "@qq.com"));
        clist.add(new Customer(5,72 ,"男" ,"陈安" ,  "18523895124" , "@qq.com"));
    }
    public HashSet<Customer> getClist() {
        return clist;
    }
    public void setClist(HashSet<Customer> clist) {
        this.clist = clist;
    }
    public void addCustomer(Customer custor){
        clist.add(custor);
    } 
    public void delCustomer(Customer custor){
        clist.remove(custor);
    }
    public void display(){
        System.out.println("序号     姓名     性别    年龄        手机           邮箱");
        for(Customer n : clist){
            System.out.println(n);
        }
    }
    public HashSet<Customer> findCustomer(String element){
        HashSet<Customer> findlist = new HashSet<>();
        for(Customer aa : clist){
            boolean result = aa.find(element);
            if(result == true){
                findlist.add(aa);
            }else{
            }
        }
        return findlist;
    }   

}
