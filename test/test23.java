public class test23 {
    private test23(){
        System.out.println("test23");
    }
    static test23 aaa =  new test23();

    private static retest23(){
        return aaa ;
    }
}

public class test33 {
    private test33(){}
    static test33 bbb = null ;
    public static gettest33(){
        if (bbb==null){
            test33 bbb = new test33();
        }else {
            return bbb ;
        }
    }
}