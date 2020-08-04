public class NaivePatternMatch {
    public static void main(String[] args) {
        String txt="ABABABCD";
        String pat = "ABAB";
        patMatch(txt,pat);
    }
//here we are comparing the pattern lineraly and in the end if the complete pattern is traveresed it indicates it exists and we print its starting index
    public static void patMatch(String txt,String pat){
        int n= txt.length();
        int m = pat.length();
        for(int i=0;i<n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(txt.charAt(i+j)!=pat.charAt(j))
                    break;
            }
            if(j==m)
                System.out.println(i);
        }
    }
}
