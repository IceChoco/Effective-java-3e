package chapter2.item06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsingKeySet {

    public static void main(String[] args) {
        Map<String, Integer> menu = new HashMap<>();
        menu.put("Burger", 8);
        menu.put("Kimbab", 9);

        Set<String> names1 = menu.keySet();
        Set<String> names2 = menu.keySet();

        //이 메서드가 names1 set만 바꾸는게 아니라 동일한 다른 셋인 name2, map인 menu 객체까지 영향을 받는다.
        names1.remove("Burger");
        System.out.println(names2.size());//1
        System.out.println(menu.size());//1
    }

}

