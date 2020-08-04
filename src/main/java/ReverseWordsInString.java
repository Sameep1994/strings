public class ReverseWordsInString {
    public static void main(String[] args) {
    String s ="I love coding";
        System.out.println(revString(s));
        System.out.println("rev: "+rev(s));
    }
    //Or we can read from the last and append in another string
    public static String rev(String s){
        String ans = "";
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }
        return ans;
    }

//here frst we reverse individual words in string then reverse the whole string
    public static String revString(String s){
        int start=0;
        for(int end=0;end<s.length();end++){
            if(s.charAt(end)==' '){
                reverse(s,start,end-1);
                start=end+1;
            }
        }
        //since last word won't have a space in end this will handle that scenario
        reverse(s,start,s.length()-1);
        //revrse the whole string
        reverse(s,0,s.length()-1);
        return s;
    }

    public static String reverse(String s,int low,int high){
        char[] ch = s.toCharArray();
        while (low<=high){
           char temp=ch[low];
           ch[low]=ch[high];
           ch[high]= temp;
           low++;
           high--;
        }
        return ch.toString();
    }

}
