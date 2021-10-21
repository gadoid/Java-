package service;

import domain.Architect;
import domain.Designer;
import domain.Employee;
import domain.Programmer;

/**
 * @author spinoza
 * @create 2021-10-18-22:15
 */
public class TeamService {
    int counter = 1 ;
    static final int MAX_MEMBER = 5 ;
    Programmer[] team = new Programmer[MAX_MEMBER];
    int total = 0;

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[this.total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];

        }
        return team ;
    }

    public void addMember(Employee employee)throws TeamException{
        if (total == 5){
            throw new TeamException("成员已满，无法添加");
        }
        if (! (employee instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        if (isExist(employee)){
            throw new TeamException("该员工已在本开发团队中");
        }
        Programmer p = (Programmer) employee ;
        if ("BUSY".equals(p.getStatus().getNAME())){
            throw new TeamException("该员工已是某团队成员");
        }
        if ("VOCATION".equals(p.getStatus().getNAME())){
            throw new TeamException("该员正在休假，无法添加");
        }
        int MAX_Pro = 0 ; int MAX_Des = 0; int MAX_ARC = 0;
        for(int i = 0 ; i < team.length ; i++){
            if (team[i] == null ){
                break;
            }else if (team[i] instanceof Architect){
                MAX_ARC++;
            }else if (team[i] instanceof Designer){
                MAX_Des++;
            }else if (team[i] instanceof Programmer){
                MAX_Pro++;
            }
        }
        if (MAX_ARC == 1 & employee instanceof Architect){
            throw  new TeamException("团队中至多只能有一名架构师");
        }else if (MAX_Des == 2 & employee instanceof Designer ) {
            throw new TeamException("团队中至多只能有两名设计师");
        }else if (MAX_Pro == 3 & employee instanceof Programmer) {
            throw new TeamException("团队中至多只能有三名程序员");
        }
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
        team[total++] = p;

        System.out.println(total);
    }

    public boolean isExist(Employee employee){
        for (int i = 0 ; i < total ; i++) {
            if (team[i].getId() == employee.getId()) {
                return true;
            }
        }
        return false;
    }
    public void removeMember(int id)throws TeamException {
        int i = 0 ;
        for (;i<total;i++){
            if (team[i].getId() == id){
                team[i].setStatus(Status.FREE);
                System.out.println(team[i].getStatus());
                break;
            }
            if (i == total){
                new TeamException("找不到该成员");
            }
            for (int j = i+1 ; j < total ; j ++){
                team[j-1] = team[j];
            }
            team[--total] = null ;
        }


    }

}
