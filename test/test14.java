import java.util.*;
public class test14 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [] students = new int [5];
    int max = 0 ;
    for (int i = 0 ; i < 5 ; i++ )
    {
        students[i] = input.nextInt();
        max = (max>students[i]) ? max : students[i];
    }
    for (int j = 0 ; j <students.length ; j++)
    {
        int bd = max - students[j] ;
        if (bd <= 10 ){
            System.out.println("students"+j+"的分数是"+students[j]+"成绩是A");
        }
        else if (bd <= 20){
            System.out.println("students"+j+"的分数是"+students[j]+"成绩是B");
        }
        else if (bd <= 30){
            System.out.println("students"+j+"的分数是"+students[j]+"成绩是C");
        }
        else {
            System.out.println("students"+j+"的分数是"+students[j]+"成绩是D");
        }

    }
}
}
