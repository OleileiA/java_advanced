package _14_ThreadLocal;

public class ThreadLocalDemo {
    /*
    * ThreadLocal是一种以空间换时间、每个线程独享一份变量副本的方式来解决线程安全问题的。
    * ThreadLocal提供了线程本地变量，也就是如果你创建了一个ThreadLocal变量，那么访问这个变量的每个线程都会有这个变量的一个本地副本。
    * */
    public static void main(String[] args) {
        String[] values = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (String str : values) {
            new Thread(() -> {
                Resource.MESSAGES.set(new Message());
                Resource.MESSAGES.get().setInfo(str);
                MessagePrint.print();
            }).start();
        }
    }
}
