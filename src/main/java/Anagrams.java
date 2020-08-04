public class Anagrams {
    public static void main(String[] args) {

        String a ="listen";
        String b="silent";
        System.out.println(isAnagram(a,b));

    }
    //here we check if two strings contain same characters
    //we declare an array of character and increment value of char array and decrement for char in second string
    //example if we encounter a in frst sting we increase value in char array and if we encounter a in second string we dec value in char array
    //in the end we traverse char array and if we find any value gt 0 we return false
    public static boolean isAnagram(String s1, String s2){
        int chars =256;
        int[] charArr = new int[chars];
        if(s1.length() != s2.length())
            return false;
        for(int i=0;i<s1.length();i++){
            charArr[s1.charAt(i)]++;
            charArr[s2.charAt(i)]--;
        }

        for(int i=0;i<chars;i++){
            if(charArr[i]>0)
                return false;
        }

        return true;
    }
}
