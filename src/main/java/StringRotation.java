public class StringRotation {
    public static void main(String[] args) {
        String a= "ABCD";
        String b = "CDAB";
        System.out.println(rotation(a,b));

    }
//if sec string is rotation of first, once the first string is appended to itself the second string can be found in the appended txt
    public static boolean rotation(String s1, String s2){
        if( s1.length() != s2.length())
            return false;
        return ((s1+s1).indexOf(s2)>=0);
    }
}
