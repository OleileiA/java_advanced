package base._17_比较器;

public class ComparableDemo implements Comparable<ComparableDemo> {

    private Double price;

    @Override
    public int compareTo(ComparableDemo o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        ComparableDemo c1 = new ComparableDemo();
        c1.price = 10.0;

        ComparableDemo c2 = new ComparableDemo();

        c2.price = 20.0;
        System.out.println(c1.compareTo(c2));

        // Arrays.sort 假设数组中的元素都实现了 Comparable 接口，那么可以使用排序
    }

}
