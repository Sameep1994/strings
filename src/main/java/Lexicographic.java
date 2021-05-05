public class Lexicographic {
    public static int CHAR = 256;
    public static void main(String[] args) {
        String s ="STRING";
        System.out.println(lexi(s));
    }
    public static int lexi(String s){
        int res=1;
        int mul = factorial(s.length());
        char[] count = new char[CHAR];
        //count occurrence of each element
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
//cumminlative count to get number of char less than curr to its left
        for(int i=1;i<CHAR;i++){
            count[i]+=count[i-1];
        }

        for(int i=0;i<s.length();i++){
            mul=mul/(s.length()-i);
            //char less than current element
            res=res+count[s.charAt(i)-1]*mul;
            //reducing the count of all elements to right
            //redo this logic
            for(int j=s.charAt(i);j<CHAR;j++)
                count[j]--;
        }
        return res;
    }

    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
}

