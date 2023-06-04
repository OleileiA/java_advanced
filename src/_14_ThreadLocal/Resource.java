package _14_ThreadLocal;

public class Resource {
    public static final ThreadLocal<Message> MESSAGES = new ThreadLocal<>() {};
}
