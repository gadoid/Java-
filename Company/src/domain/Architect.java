package domain;

import service.Status;

/**
 * @author spinoza
 * @create 2021-10-18-19:15
 */
public class Architect extends Designer {
    int stock ;
    Architect(){
        super();
    }
    public Architect(int id , String name , int age , double salary , Equipment equipment  , double bonus , int stock){
        super(id,name,age,salary,equipment,bonus);
        this.stock = stock ;
    }

    @Override
    public String toString(){
        return Integer.toString(id)+"\t"+"\t"+this.name+"\t\t"+Integer.toString(age)+"\t\t"+Double.toString(salary)+"\tArchitect\t"+this.status+"\t\t"+equipment.getDescription()+"\t\t"+Double.toString(bonus)+"\t\t"+Integer.toString(stock);
    }
}
