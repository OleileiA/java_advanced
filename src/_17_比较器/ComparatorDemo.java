package _17_比较器;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {

    private Double price;

    public ComparatorDemo(Double price) {
        this.price = price;
    }

    // 如果已经定义好的类，没有实现 Comparable 接口，或者实现了 Comparable 接口，
    // 但是排序规则不满足要求，那么可以使用 Comparator 接口来实现排序

    public static void main(String[] args) {

        ComparatorDemo[] comparatorDemo = new ComparatorDemo[] {
            new ComparatorDemo(10.0),
            new ComparatorDemo(20.0),
            new ComparatorDemo(30.0)
        };

        Comparator<ComparatorDemo> comparator = (o1, o2) -> {
            if (o1.price > o2.price) {
                return 1;
            } else if (o1.price < o2.price) {
                return -1;
            } else {
                return 0;
            }
        };

        Arrays.sort(comparatorDemo, comparator);
    }
}
