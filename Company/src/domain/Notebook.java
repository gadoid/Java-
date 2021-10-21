package domain;

/**
 * @author spinoza
 * @create 2021-10-18-18:24
 */
public class Notebook implements Equipment{
    String model ;
    double price ;
    public Notebook(String model,double price){
        this.model = model ;
        this.price = price ;
    };

    @Override
    public String getDescription(){
        return this.model + this.price;
    }
}
