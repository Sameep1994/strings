import java.util.Arrays;

public class LongestSubstringWithDistinctChar {
    public static void main(String[] args) {
        String s= "abcadbd";
        System.out.println(longest(s));
    }
    /*maxEnd(j): length of longest substring with dist char which ends at j
    *
    *using maxEnd(j-1) we find maxEnd(j)
    * if str(j) not present in maxEnd(j-1)=> maxEnd(j)=maxEnd(j-1)+1
    * else
    * j-(prev(str[j])+1) where prev(str[j]) is index of char str[j]
    * */
    public static int longest(String str){
        int n = str.length();
        int res = 0;
        int prev[]=new int[256];
        Arrays.fill(prev,-1);
        int i=0;
        for (int j = 0; j < n; j++){
//j is end index, for start index of curr window we use prev[str[j]] which gives start char of prev window
//and prev index of curr char using both we find start index
//todo revisit logic
            i=Math.max(i,prev[str.charAt(j)]+1);
            //j consider as last char of substring end with j
            int maxEnd=j-i+1;
            res=Math.max(res,maxEnd);
            //stores previous occurence of index of any char
            prev[str.charAt(j)]=j;
        }
        return res;
    }
}
