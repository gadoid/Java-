import java.util.*;
public class test11 {
    public static void main(String[] args) {
        for (int i = 1 ; i<100 ; i++){
            if (i%2==0 & i/2 ==1){
                System.out.println(i);
            }
            else if(i%2==0){
                continue;
            }
            else {
                for (int j =2 ; j<(i/2) ;j++){
                    if (i%j==0){
                        break;
                    }
                if (j==i/2){
                    System.out.println(i);
                };
                }

            }
            }
        }

    }

