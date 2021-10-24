public class test28 {
    public static String trim(String s){
        int i , j ;
        for(i = 0; i < s.length() ; i++){
            if (s.charAt(i) != ' '){
                break;
            }
        }
        for(j = s.length()-1 ; j >= 0 ; j--){
            if (s.charAt(j) != ' '){
                break;
            }
        }
        return s.substring(i, j);
    }

    public static void main(String[] args) {
        String test = "              adisjob  ";
        String a = trim(test);
        System.out.println(a);
        System.out.println(a.length());
    }
}
