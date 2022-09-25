package text04;

public class Solution {
    public char findTheDifference(String s, String t) {
       int temp1[]=new int [26];
       int temp2[]=new int [26];
        for (int i = 0; i < s.length(); i++) {
            temp1[s.charAt(i)-'a']++;
            temp2[t.charAt(i)-'a']++;
        }
        temp2[t.charAt(t.length()-1)-'a']++;
        int k=-1;
        for(int i=0;i<26;i++){
            if(temp1[i]!=temp2[i]){
                k=i;
            }
        }
        return  (char)(k+'a');
    }
}
