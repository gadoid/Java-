import java.io.PrintStream;

public class test20  {
    public static void main(String[] args) {
        int a = 10 ;
        method(a);
        System.out.println(a);
    }
        

    public static void method(int a){
        PrintStream ps = new PrintStream(System.out){
            @Override
            public void println(String x){
                if("a=10".equals(x)){
                    x = "a=100";
                }
                super.println(x);
            };
        };
        System.setOut(ps);
    }
}