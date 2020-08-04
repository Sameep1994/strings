import java.util.HashSet;

public class LongestSubStringWithDistinctCharacters {
    public static void main(String[] args) {
        String s= "abcdabc";
        System.out.println(longestDistinctSubstr(s));
    }
//we maintain a hashset and as we encounter unique char we add it while maintaining a start index
//when a duplicate is encountered, length is compared with max length
//start element and start to evaluate from the next element
    public static int longestDistinctSubstr(String s){
        HashSet<Character> hs = new HashSet<>();
        int res=0,start=0;
        for(int i=0;i<s.length();i++){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
            }else{
                res=Math.max(res,hs.size());
//                hs.remove(s.charAt(start));
//                hs.add(s.charAt(i));
                start++;
            }
        }
        return res;
    }
}
