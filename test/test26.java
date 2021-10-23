import java.util.concurrent.locks.ReentrantLock;

class test261 extends Thread {
    private static int account = 0 ;
    private static ReentrantLock lock = new ReentrantLock();
    public int getAccount(){
        return account;
    }
    public void store (){
            try{
                lock.lock();
                int a = account;
                System.out.println(Thread.currentThread().getName()+"准备存钱,当前余额："+a);
                account+=100;
                System.out.println(Thread.currentThread().getName()+"存钱,当前余额："+a);
                lock.unlock();
            }
            finally{
            }
        
        
    }


    public void run (){
        for(int i= 0 ; i < 3 ; i ++){
            store();
        }
    }
}

class storer{
    int value = 3000;
    storer(){
    }
}


public class test26 {
    public static void main(String[] args) {
        test261 a = new test261();
        test261 b = new test261();
        a.setName("user1");
        b.setName("user2");
        a.start();
        b.start();
    }



}