package text04;



public class Solution7 {
    public boolean checkRecord(String s) {
    int que=0;
    int queL=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='P'){
                que++;
            }
            if(s.charAt(i)=='L'){
                queL++;
            }

        }
        if(que==3){
            return false;
        }
        return  true;
}
}
