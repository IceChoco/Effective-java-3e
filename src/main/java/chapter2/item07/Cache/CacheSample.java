package chapter2.item07.Cache;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class CacheSample {

    public static void main(String[] args) {
        Object key1 = new Object();//스트롱한 레퍼런스
        Object value1 = new Object();

        Map<Object, Object> cache = new HashMap<>();
        cache.put(key1, value1);

        // key1에 대한 참조가 사라졌을 경우에 GC 대상이 된다.
        Map<Object, Object> cache2 = new WeakHashMap<>();
        cache.put(key1, value1);
    }
}
