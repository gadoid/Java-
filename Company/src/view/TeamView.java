package view;

import domain.Employee;
import domain.Programmer;
import service.NameListService;
import service.TeamException;
import service.TeamService;

/**
 * @author spinoza
 * @create 2021-10-19-19:39
 */
public class TeamView {
    NameListService listSvc = new NameListService();
    TeamService teamSvc = new  TeamService();
    public void enterMainMenu() {
            while (true) {
                listAllEmployees();
                int choice = TSUtility.readInt();
                switch (choice) {
                    case 1:
                        getTeam();
                        TSUtility.readReturn();
                        break;
                    case 2:
                        addMember();
                        TSUtility.readReturn();
                        break;
                    case 3:
                        deleteMember();
                        TSUtility.readReturn();
                        break;
                    case 4:
                        System.exit(0);
                        TSUtility.readReturn();
                        break;

                }
            }

    }
    private void listAllEmployees(){
        System.out.print("-------------------------------------开发团队调度软件--------------------------------------\n");
        System.out.print("ID     姓名      年龄    工资         职位      状态   领用设备   奖金        股票    \n");
        Employee[] team = listSvc.getAllEmployees();
        for(int i = 0 ; i < team.length ; i++){
           System.out.println(team[i]);
       }
        System.out.print("----------------------------------------------------------------------------------------------\n");
        System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)： _");
    };
    private void getTeam(){
       Programmer[] pt =  teamSvc.getTeam();
       System.out.print("-------------------------------------团队列表--------------------------------------\n");
       System.out.print("TeamID ID  姓名      年龄    工资         职位      状态   领用设备   奖金        股票    \n");

        for (int i = 0 ; i < pt.length ; i++){
            System.out.print(pt[i].getMemberId()+"\t");
            System.out.println(pt[i]);
        }

    };
    private void addMember(){
        System.out.println("输入ID");
        int num = TSUtility.readInt();
        try {    teamSvc.addMember(listSvc.getEmployee(num));
        }catch (TeamException e ){
            System.out.println(e.getMessage());
        }

    };
    private void deleteMember(){
        System.out.println("输入ID");
        int num = TSUtility.readInt();
        try{
            teamSvc.removeMember(num);
        }catch (TeamException e){}
    };
}
