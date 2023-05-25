package _2_AutoCloseable;

public class NetMessage implements IMessage {

    /*
    * 实现 AutoCloseable 接口的类可以保证在使用完资源后，自动关闭资源，不需要手动调用 close() 方法。这样可以避免代码中出现资源未关闭的情况，从而防止内存泄漏等问题。
    * 当在 try-with-resources 语句中使用实现了 AutoCloseable 接口的对象时，当代码执行完毕或者抛出异常时，对象会自动关闭。
    * */

    public NetMessage() {
        System.out.println("连接远程服务器，创建消息的发送通道");
    }

    @Override
    public void send(String msg) {
        System.out.println("发送 " + msg + " via Net");
    }

    public void close() {
        System.out.println("关闭消息的发送通道，断开与远程服务器的连接");
    }

    public static void main(String[] args) {
        try (NetMessage netMessage = new NetMessage()) {
            netMessage.send("Hello");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
