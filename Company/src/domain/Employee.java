package domain;

public class Employee {
    int id ;
    String name ;
    int age ;
    double salary ;
    Employee(){

    }
    public Employee(int id, String name , int age ,double salary){
        this.id = id ;
        this.name = name ;
        this.age = age ;
        this.salary = salary ;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return Integer.toString(id)+"\t\t"+this.name+"\t\t"+Integer.toString(age)+"\t\t"+Double.toString(salary)+"\tEmployee";
    }
}
