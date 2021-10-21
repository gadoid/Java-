package service;
import static service.Data.*;
import domain.*;



/**
 * @author spinoza
 * @create 2021-10-18-19:18
 */
public class NameListService {
    Employee [] employees = new Employee[EMPLOYEES.length];
    public NameListService(){
        for(int i = 0 ; i < employees.length; i++ ){
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            switch (type){
                case EMPLOYEE :
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER :
                    Equipment equipment = getEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    Equipment equipment1 = getEquipment(i);
                    employees[i] = new Designer(id,name,age,salary,equipment1,bonus);
                    break;
                case ARCHITECT:
                    double bonus1 = Double.parseDouble(EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(EMPLOYEES[i][6]);
                    Equipment equipment2 = getEquipment(i);
                    employees[i] = new Architect(id,name,age,salary,equipment2,bonus1,stock);

            }
        }

    }
    public Equipment getEquipment(int i ) {
        int eq = Integer.parseInt(EQUIPMENTS[i][0]);
        switch (eq) {
            case PC:
                String model = EQUIPMENTS[i][1];
                String display = EQUIPMENTS[i][2];
                PC pc = new PC(model,display);
                return pc ;
            case PRINTER:
                String name = EQUIPMENTS[i][1];
                String type = EQUIPMENTS[i][2];
                Printer printer = new Printer(name,type);
                return printer ;
            case NOTEBOOK:
                String model1 = EQUIPMENTS[i][1];
                double price = Double.parseDouble(EQUIPMENTS[i][2]);
                Notebook notebook = new Notebook(model1,price);
                return notebook ;
        }
        return null;
    }
    public Employee[] getAllEmployees(){
        return this.employees;
    }
    public Employee getEmployee(int id)throws TeamException {
        for(int i = 0 ; i < employees.length ; i++){
            if (employees[i].getId() == id ){
                System.out.println(employees[i]);
                return employees[i];
            }
        }
        throw new TeamException("未找到对应员工");
    }
}
