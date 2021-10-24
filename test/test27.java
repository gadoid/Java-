
public class test27 {
    public static void main(String[] args) {
        clerk a1 = new clerk();
        producer b1 = new producer(a1);
        customer b2 = new customer(a1);
        customer b3 = new customer(a1);
        b1.setName("生产者1");
        b2.setName("消费者1");
        b3.setName("消费者2");
        b1.start();
        b2.start();
        b3.start();
    }
}

class clerk {
    protected int garbage = 0;
    public void produce(){
        synchronized(this){
        if(garbage<20){
        garbage ++ ;
        System.out.println(Thread.currentThread().getName() + "进行生产，当前余额" + Integer.toString(garbage));
    }
}
}

    public void custome(){
        synchronized(this){
        if(garbage>0){
            garbage -- ;
            System.out.println(Thread.currentThread().getName() + "进行消费，当前余额" + Integer.toString(garbage));
        }
    }
    }
}

class producer extends Thread {
    clerk c;

    producer(clerk c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            c.produce();
    }
}
}

class customer extends Thread {
    clerk c;

    customer(clerk c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            c.custome();
        }
    }

}
