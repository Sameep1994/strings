public class AnagramSearch {
    public static void main(String[] args) {
        String txt = "BACDGABCDA";
        String pat= "ABCD";
        search(pat,txt);
    }
//we store the value of first window and the pattern in char array
//compare and traverse through the rest
    public static void search(String pat, String txt){
        int m = pat.length();
        int n= txt.length();

        char[] countP = new char[256];
        char[] countTxt = new char[256];
//first window stored
        for(int i=0;i<m;i++){
            countP[pat.charAt(i)]++;
            countTxt[txt.charAt(i)]++;
        }
//traverse through the rest of the array
        for(int i=m;i<n;i++){
            if(compare(countP,countTxt))
                System.out.println("Found At "+(i-m));
            //removing the frst char of the window
            countTxt[txt.charAt(i-m)]--;
            //adding the latest char to window
            countTxt[txt.charAt(i)]++;
        }
//takes last window in account
        if(compare(countP,countTxt))
            System.out.println("Found At "+(n-m));
    }

    static boolean compare(char arr1[], char arr2[])
    {
        for (int i = 0; i < 256; i++)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }
}
