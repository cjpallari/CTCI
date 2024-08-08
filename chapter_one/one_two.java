package CTCI.chapter_one;

import java.util.HashMap;
import java.util.Map;

public class one_two {
    public static void main(String[] args) {
        if (isPermutation("abc", "cba"))
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static boolean isPermutation(String a, String b) {
        /*
         * loops through the first string and maps the char to its count
         * second loop
         */
        Map<Character, Integer> map = new HashMap<>();

        if (a.length() != b.length())
            return false;

        for (Character c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            System.out.println(map);
        }

        for (Character c : b.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (Character val : map.keySet()) {
            Integer value = map.get(val);
            if (value != 0)
                return false;
        }

        return true;
    }

}
