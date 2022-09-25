package text04;

import java.util.*;

public class Solution4 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for (String str :
                strs) {
            char arrays[] = str.toCharArray();
            Arrays.sort(arrays);
            String key=new String(arrays);

            //getOrDefault如果key值存在 则返回对应的value值 反之则返回一个默认值 就是第二个参数
            List<String> list=map.getOrDefault(key,new ArrayList<>());
            list.add(str);
            map.put(key,list);
        }

        return new ArrayList<List<String>>(map.values());
    }
}
