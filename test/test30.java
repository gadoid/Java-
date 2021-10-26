public class test30 {
    public static int counter(String t , String s){
        int c = 0 ;
        int d = 0 ;
        String n = t ;
        while (true){
            int m = n.indexOf(s);
            if(m){
            n =n.substring(m);
            }
        }
        t.indexOf(s)

    }
    public static void main(String[] args) {
        int t = counter(args[0],args[1]);
        System.out.println(t);.
    }
}
