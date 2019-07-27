package jianzhiOffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Offer50 {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
           if(map.get(str.charAt(i))==1){
               return i;
           }
        }
        return -1;
    }
    public String RemoveReChar(String str, String pattern) {
        HashSet<Character> set = new HashSet<>();

        for(Character c : pattern.toCharArray()){
            set.add(c);
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(!set.contains(str.charAt(i))){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public String RemoveReCharSingle(String str) {

        HashSet<Character> set = new HashSet<>();

        StringBuffer sb = new StringBuffer();

        for(int i=0;i<str.length();i++){
            if(!set.contains(str.charAt(i))){
                sb.append(str.charAt(i));
            }
            set.add(str.charAt(i));
        }
        return sb.toString();

    }


    public static void main(String[] args) {
        Offer50 o = new Offer50();
        System.out.println(o.FirstNotRepeatingChar("google"));
    }

}
