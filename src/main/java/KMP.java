public class KMP {
    public static void main(String[] args) {
        String str = "abcxabcdabcdabcy";
        String subString = "abcdabcy";
        System.out.println(KMP(str.toCharArray(),subString.toCharArray()));

    }
    //redo
//how to build this temp array:  https://www.youtube.com/watch?v=GTJr8OvyEVQ
    public static int[] buildTempArray(char[] str,char[] subString){

        int[] temp = new int[subString.length];
        int index=0;
        for(int end=1 ; end<subString.length;){
            if(str[index]==str[end]){
                temp[end]=index+1;
                index++;
                end++;
            }else{
                if(index!=0){
                    index=temp[index-1];
                }else{
                    temp[end]=0;
                    end++;
                }
            }
        }
        return temp;
    }

    public static boolean KMP(char[] str, char[] subString){
        int[] temp = buildTempArray(str,subString);
        int i=0,j=0,m=str.length,n=subString.length;
        while (i<m && j<n){
            if(str[i]==subString[j]){
                i++;
                j++;
            }else{
                if(j!=0){
                    j=temp[j-1];
                }else{
                    i++;
                }
            }
        }
      if(j==n){
          return true;
      }
        return false;
    }
}
