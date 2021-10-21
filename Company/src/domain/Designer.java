package domain;
import service.Status;
import static service.Status.FREE;

/**
 * @author spinoza
 * @create 2021-10-18-19:06
 */
public class Designer extends Programmer {
    double bonus ;
    Designer(){
        super();
    };
    public Designer(int id , String name , int age , double salary , Equipment equipment ,  double bonus){
        super(id,name,age,salary,equipment);
        this.bonus = bonus;
    }
    @Override
    public String toString(){
        return Integer.toString(id)+"\t"+"\t"+this.name+"\t\t"+Integer.toString(age)+"\t\t"+Double.toString(salary)+"\tDesigner\t"+this.status+"\t\t"+equipment.getDescription()+"\t\t"+Double.toString(bonus);
    }
}
