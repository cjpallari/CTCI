package CTCI.chapter_one;

import java.util.HashMap;
import java.util.Map;

public class one_one {
    public static void main(String[] args) {
        if (isUnique("race car"))
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static boolean isUnique(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()) {
            if (map.getOrDefault(c, 0) != 0)
                return false;
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return true;
    }
}
