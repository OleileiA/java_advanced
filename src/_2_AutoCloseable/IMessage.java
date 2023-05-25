package _2_AutoCloseable;

public interface IMessage extends AutoCloseable {
    public void send(String msg);
}
