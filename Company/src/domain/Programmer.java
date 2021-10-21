package domain;
import static service.Status.*;
import service.*;


/**
 * @author spinoza
 * @create 2021-10-18-18:33
 */
public class Programmer extends Employee{
    int memberId ;
    Status status = FREE ;
    Equipment equipment ;

    Programmer(){
        super();
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public Status getStatus(){
        return this.status;
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }
    @Override
    public String toString(){
        return Integer.toString(id)+"\t"+"\t\t"+this.name+"\t\t"+Integer.toString(age)+"\t\t"+Double.toString(salary)+"\tProgrammer\t"+this.status+"\t\t"+equipment.getDescription();
    }
}
