public class test8 {
    public static void main(String[] args) {
        for (int i =0 ; i<150 ; i++){
            String content = Integer.toString(i);
            if(i%3 == 0){
                content +=" foo";
            }
            if(i%5 == 0){
                content +=" biz";
            }
            if(i%7 == 0){
                content +=" baz";
            }
            System.out.println(content);
        int sum = 0 ;
        for (int j = 0 ; j < 100 ; j++){
            sum += (j%2==0) ? j:0;
                }
        System.out.println(sum);
        }
    }    
}
