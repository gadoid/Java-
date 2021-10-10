import java.util.*;

public class CustomerView {
    static Scanner input = new Scanner(System.in);
    static CustomerList cl = new CustomerList();
    static int counter = 1 ;
    static String string ;
    public static void main(String[] args) {
        while(true){
            display();
            int num = input.nextInt();
            operation(num,cl);
        }
    }
    
    public static void display(){
        System.out.println("——————客户信息管理软件——————");
        System.out.println("1 添加客户");
        System.out.println("2 修改客户");
        System.out.println("3 删除客户");
        System.out.println("4 客户列表");
        System.out.println("5 退    出");
        System.out.println();
        System.out.println("请选择（1-5）");
    }

    public static void operation(int a,CustomerList cl ){
        HashSet<Customer> cllist = cl.getClist();
        switch (a) {
            case 1:
                System.out.println("——————————添加客户——————————"); 
                System.out.print("姓名：");
                String name = input.next();
                System.out.print("性别：");
                String sexual = input.next();
                System.out.print("年龄：");
                int age = input.nextInt();
                System.out.print("电话：");
                String tel = input.next();
                System.out.print("邮箱：");
                String mail = input.next();
                Customer n = new Customer(counter++,age,sexual,name,tel,mail);
                cl.addCustomer(n);
                System.out.println("——————————添加完成——————————");
                break;
            case 2 :
                System.out.println("——————————修改客户——————————"); 
                System.out.println("————————修改客户信息————————"); 
                String modify_info = input.next();
                HashSet <Customer>  modifyinfolist ;
                modifyinfolist = cl.findCustomer(modify_info);
                System.out.println("————————查找到以下用户————————");
                System.out.println("序号     姓名      性别    年龄       手机             邮箱");
                for (Customer aaa : modifyinfolist){
                    System.out.println(aaa);
                }
                System.out.println("—————————————————————————————");
                System.out.println("请根据序号选择要修改信息的用户");
                int modifychoice = input.nextInt();
                for (Customer aaa : modifyinfolist){
                    //boolean modify_status = true;
                    if (aaa.getId() == modifychoice){
                        //while(modify_status){
                        System.out.print("输入需修改的信息名称：");
                        String modify_info1 = input.next();
                        switch (modify_info1){
                            case "name":
                            case "姓名":
                                System.out.print("输入新修改的姓名信息:");
                                String namemessage = input.next();
                                aaa.setName(namemessage);
                                System.out.println("已修改用户"+aaa.getId()+"姓名为："+aaa.getName());
                                break;
                            case "性别":
                            case "sex":
                            case "sexual":
                                System.out.print("输入新修改的性别信息:");
                                String sexualmessage = input.next();
                                aaa.setSexual(sexualmessage);
                                System.out.println("已修改用户"+aaa.getId()+"性别为："+aaa.getSexual());
                                break;
                            case "age":
                            case "年龄":
                                System.out.print("输入新修改的年龄信息:");
                                int agemessage = input.nextInt();
                                aaa.setAge(agemessage);
                                System.out.println("已修改用户"+aaa.getId()+"年龄为："+Integer.toString(aaa.getAge()));
                                break;
                            case "手机号":
                            case "手机":
                            case "tel":
                            case "电话":
                                System.out.print("输入新修改的手机信息:");
                                String telmessage = input.next();
                                aaa.setTel(telmessage);
                                System.out.println("已修改用户"+aaa.getId()+"手机号为："+aaa.getTel());
                                break;
                            case "mail":
                            case "邮箱":
                                String mailmessage = input.next();
                                System.out.print("输入新修改的邮箱信息:");
                                aaa.setTel(mailmessage);
                                System.out.println("已修改用户"+aaa.getId()+"手机号为："+aaa.getMail());    
                                break;  
                                // case "q" :
                                // case "quit": 
                                // case "exit":
                                // case "0":
                                //     modify_status = false;                          

                            }
                        } 
                    }
                    break;

            case 3 :
                System.out.println("——————————删除客户——————————"); 
                System.out.println("————————输入客户信息————————"); 
                String info = input.next();
                HashSet <Customer>  infolist ;
                infolist = cl.findCustomer(info);
                System.out.println("————————查找到以下用户————————");
                System.out.println("序号     姓名      性别    年龄      手机           邮箱");
                for (Customer aaa : infolist){
                    System.out.println(aaa);
                }
                System.out.println("—————————————————————————————");
                System.out.println("请根据序号选择要删除的用户");
                int choice = input.nextInt();
                for (Customer aaa : infolist){
                    if (aaa.getId() == choice){
                        String delname = aaa.getName();
                        cl.delCustomer(aaa);
                        System.out.println("已删除用户:"+delname);
                    }
                }
                break;
            case 4 :
                cl.display();
                break;
            case 5 :
                System.exit(0);
            default:
                break;
        }

    }
    
}
