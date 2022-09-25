package text04;


import java.util.*;

@SuppressWarnings({"all"})
public class Solution5 {
    public String frequencySort(String s) {
      Map<Character,Integer>map=new HashMap<>();
      //进行放入map容器中
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            int flag=map.getOrDefault(c,0)+1;
            map.put(c,flag);
        }
        //接着进行排序 首先定义一个 List 容器存放 字符
        List<Character> list=new ArrayList<>(map.keySet());
        //利用Collection函数
        Collections.sort(list,(a,b)->map.get(b)-map.get(a));
        StringBuffer sb=new StringBuffer();
        int size=list.size();
        for (int i = 0; i < size; i++) {
            char c=list.get(i);
            for (int j = 0; j < map.get(i); j++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
