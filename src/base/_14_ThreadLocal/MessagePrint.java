package base._14_ThreadLocal;

public class MessagePrint {
    public static void print() {
        System.out.println("[message print]" + Resource.MESSAGES.get().getInfo());
    }
}
