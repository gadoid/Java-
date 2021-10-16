import java.lang.Exception;
public class EcmDef {
    EcmDef(){

    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException , NumberFormatException {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        try {
            double value = ecm(num1,num2);
            System.out.println(value);
        } catch(NumberFormatException e){
            System.out.println("值不匹配");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("过多的参数");
        } catch(EcDef e){
            System.out.println(e.getMessage());
        } 
        finally{
            System.out.println("结束");
        }

    }

    public static double ecm (double a , double b) throws EcDef{
        System.out.println(b);
        try {
            if (b == 0.0){
                throw new EcDef("除数为0！");
            }
            else return a/b ;
        }
        finally{
            System.out.println("运算结束");
        }
    
}
}

class EcDef extends Exception{
    static final long serialVersionUID = -3387516293124229948L;
    EcDef(){

    };
    EcDef(String msg){
        super(msg);
    }

}