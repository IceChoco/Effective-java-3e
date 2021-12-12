package item24;

import java.util.AbstractList;
import java.util.List;

public interface IntListHelper {

    static List<Integer> intArrayAsList(int[] a) {
        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return a[index];
            }

            @Override
            public int size() {
                return a.length;
            }
        };
    }
}
