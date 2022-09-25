package text04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        int flag[] = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if(flag[i]==0) {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                char array[] = strs[i].toCharArray();
                Arrays.sort(array);
                for (int j = i + 1; j < strs.length; j++) {
                    if (flag[j] == 0) {
                        char arrays[] = strs[j].toCharArray();
                        Arrays.sort(arrays);
                        if (equals(arrays,array)) {
                            list.add(strs[j]);
                            flag[j] = 1;
                        }
                    }
                }
                res.add(list);
            }
        }
        return res;
    }
    private boolean equals(char[]a,char[]b){
        if(a.length==b.length){
            for (int i = 0; i < a.length; i++) {
                if(a[i]!=b[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String str[]={"eat","tea","tan","ate","nat","bat"};
        Solution2 solution2 = new Solution2();
        solution2.groupAnagrams(str);

    }
}
