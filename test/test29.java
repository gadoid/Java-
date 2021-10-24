public class test29 {
    public static String reversd(String s, String a , String b){
            String d = s.substring(Integer.parseInt(a),Integer.parseInt(b));
            char[] chararray = d.toCharArray();
            char[] array  = new char[chararray.length]; 
            for (int i = chararray.length,j = 0 ; i>0 ; i--){
                array[j] = chararray[i-1];
                j++;
            }
            String st = String.copyValueOf(array);
            String re = s.replace(d, st);
        return re;
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        String se = reversd(s, args[0], args[1]);
        System.out.println(se);
    }
}
