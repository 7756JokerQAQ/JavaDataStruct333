package text04;

public class Solution6 {
    public boolean judgeCircle(String moves) {
        int []temp=new int[2];
        for (int i = 0; i < moves.length(); i++) {
            char c=moves.charAt(i);
            if(c=='U'){
                temp[0]++;
            }else if(c=='D'){
                temp[0]--;
            }else if(c=='L'){
                temp[1]--;
            }else{
                temp[1]++;
            }
        }
        if(temp[0]==0&&temp[1]==0){
            return true;
        }
        return false;
    }
}
