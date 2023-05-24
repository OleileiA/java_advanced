package _1_String;

public class StringBufferDemo {
    public static void main1(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        change(stringBuffer);
        System.out.println(stringBuffer);
    }

    private static void change(StringBuffer stringBuffer) {
        stringBuffer.append("!");
    }

    /*
    * StringBuffer数据实际存储的是一个字节数组，数组的默认长度为16
    * 当超过16时，会自动扩容，扩容为原来的2倍 + 2
    * 例如：原来的长度为16，扩容后的长度为16 * 2 + 2 = 34
    * 之所以+2，是因为容量可以传入0，那么扩容还是0所以最起码+2
    * */
    public static void main(String[] args) {
        // 设置默认容量为30
        StringBuffer buffer = new StringBuffer(30);
        buffer.insert(0, "Hello");
        buffer.delete(0, 2);
        buffer.replace(0, 2, "He");
        buffer.reverse();
        System.out.println(buffer);
    }

    /*
    * StringBuffer和String的区别
    * 1. String是不可变的字符序列，StringBuffer是可变的字符序列
    * 2. StringBuffer提供了一些String没有的方法。例如：insert、delete、replace、reverse等
    *
    * */
}
