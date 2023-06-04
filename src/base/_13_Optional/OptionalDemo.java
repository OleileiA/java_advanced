package base._13_Optional;

public class OptionalDemo {

    // 在JAVA开发中，经常会遇见返回值为null
    // 为了避免空指针异常，我们需要对返回值进行判断
    // 但是这样会导致代码冗余，可读性差
    // JAVA8中引入了Optional类，用来解决这个问题
    public static void main(String[] args) {
        IMessage iMessage = Factory.getInstance().get();
        iMessage.send("hello");
    }
}
