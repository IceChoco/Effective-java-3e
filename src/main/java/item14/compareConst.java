package item14;

import java.util.Comparator;

//
public class compareConst implements Comparable<compareConst> {
    private long height;
    private double weight;
    private int age;

    public compareConst(long height, double weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public int compareTo(compareConst rawSerialCompare) {
        int result = Long.compare(height, rawSerialCompare.height);
        if (result == 0) {
            result = Double.compare(weight, rawSerialCompare.weight);
            if (result == 0) {
                return Integer.compare(age, rawSerialCompare.age);
            }
        }
        return result;
    }
}

class ComparatorConstructor implements Comparable<ComparatorConstructor> {
    private static final Comparator<ComparatorConstructor> COMPARATOR =
            Comparator.comparingLong((ComparatorConstructor cc) -> cc.height)
                    .thenComparingDouble(cc -> cc.weight)
                    .thenComparingInt(cc -> cc.age);

    private long height;
    private double weight;
    private int age;

    public ComparatorConstructor(long height, double weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public int compareTo(ComparatorConstructor comparatorConstructor) {
        return COMPARATOR.compare(this, comparatorConstructor);
    }
}