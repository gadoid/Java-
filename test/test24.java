public class test24 extends Thread {
    private int n ;
    test24(int n ){
        this.n = n ;
    }
    synchronized private void read (){
        for (int i = 0 ; i < 101; i ++){
            if (i%2 == n){
                System.out.println(i);
            }
        }
    }
    public void run(){
        read();
    }
    public static void main(String[] args){
        test24 a = new test24(0);
        test24 b = new test24(1);
        b.start();
        a.start();

    }
}
