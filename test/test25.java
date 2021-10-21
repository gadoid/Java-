public class test25 implements Runnable{
    private static int ticket = 1000 ;
    public synchronized void sell(){
        while(true){
        System.out.print(Thread.currentThread().getName()+"售出了一张票,剩余"+ticket+"张\n");
        ticket -- ;
        if (ticket < 1) break ;
        }
    }
    public void run(){
        sell();
    }
    public static void main(String[] args) {
        Runnable t1 = new test25();
        Thread s1 = new Thread(t1);
        Thread s2 = new Thread(t1);
        s2.setPriority(Thread.MAX_PRIORITY);
        s1.setName("1");
        s2.setName("2");
        s1.start();
        s2.start();
    }
}
