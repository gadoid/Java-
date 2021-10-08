public  class test18 {
public static void main(String[] args) {
    int [] nums = new int[100];
    for (int i = 0  ; i < nums.length ; i ++)
    {
        nums[i] = (int)(Math.random()*100);
        System.out.println(nums[i]);
    }
    int n = 0 ;
    int i = 0 ;
    int j = nums.length ;
    while (n < nums.length ){
        if (nums[n] > nums[j]){
            int tmp ;
            tmp = nums[j];
            nums[j] = nums[i];
            nums[i] = tmp ;
            n = n+1 ;
        } 
        else {

        }
    }
}
}
