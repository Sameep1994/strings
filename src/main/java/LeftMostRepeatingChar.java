public class LeftMostRepeatingChar {
    public static void main(String[] args) {
        String str ="abbcc";
        System.out.println(leftMostRepCharecter(str));
    }
    //we traverse the array from right to left
    //we maintain a visted boolean array
    //if a char is visited we maintain its index as result
    //else we mark the visited as true
    public static char leftMostRepCharecter(String s){
        int res=0;
        boolean[] visited = new boolean[256];
        for(int i=s.length()-1;i>=0;i--){
            if(visited[s.charAt(i)]){
                res=i;
            }else{
                visited[s.charAt(i)]=true;
            }
        }
        return s.charAt(res);
    }
}
