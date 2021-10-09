public class test19 {
    public static void main(String[] args) {
        student [] people = new student[20];
        for (int i = 0 ; i < people.length ; i++){
            people[i] = new student();
        }
        for (int j = 0 ; j < people.length ; j++){
            if (people[j].state == 3){
                System.out.println(people[j]);
            }
        }
        for (int k = 0 ; k < people.length ; k++){
            for (int l = k ; l < people.length ; l++){
                if (people[k].grade < people[l].grade){
                    student tmp ;
                    tmp = people[k];
                    people[k] = people[l]; 
                    people[l] = tmp;
                }
            }
        }
        for (int m = 0 ; m < people.length ; m++ ){
            System.out.println(people[m]);
        }
    }
}

class student {
    int snum = (int)Math.round(Math.random()*100);
    int grade = (int)Math.round(Math.random()*100);
    int state = (int)Math.round(Math.random()*4);
    @Override
    public String toString() {
        return "学号:"+Integer.toString(snum)+"成绩："+Integer.toString(grade)+"年级："+Integer.toString(state);
    }

}