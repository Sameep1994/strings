import java.util.Arrays;

public class LeftMostNonRepChar {
    public static void main(String[] args) {
        String s= "abbcbda";
        int res = leftMostNonRep(s);
        System.out.println(s.charAt(res));
    }
//here we maintain an array of -1
//update it with index of the element visited whenever visited
//whenever visited the second time update it with -2
//traverese the string from left to right and match in the visited array
    public static int leftMostNonRep(String s){
        int[] visited = new int[256];
        int res= Integer.MAX_VALUE;
        Arrays.fill(visited,-1);
        for(int i=0;i<s.length();i++){
            if(visited[s.charAt(i)]==-1){
                visited[s.charAt(i)]=i;
            }else{
                visited[s.charAt(i)]=-2;
            }
        }
        for(int i=0;i<visited.length;i++){
            if(visited[i]>=0)
                res=Math.min(res,visited[i]);
        }
        return (res==Integer.MAX_VALUE)?-1:res;
    }
}
