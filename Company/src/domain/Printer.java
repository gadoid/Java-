package domain;

/**
 * @author spinoza
 * @create 2021-10-18-18:16
 */
public class Printer implements Equipment{
    String name ;
    String type ;
    public Printer(String name,String type ){
        this.name = name ;
        this.type = type ;
    }

    @Override
    public String getDescription() {
        return this.name + this.type ;
    }
}
