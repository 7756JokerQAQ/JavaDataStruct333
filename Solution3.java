package text04;

public class Solution3 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int temp1[]=new int[26];
        int temp2[]=new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            temp1[ransomNote.charAt(i)-'a']++;
        }
        for (int i = 0; i < magazine.length(); i++) {
            temp2[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(temp1[i]!=0){
                if(temp1[i]>temp2[i]){
                    return false;
                }
            }
        }
        return  true;
    }
}
