package _13_Optional;

import java.util.Optional;

public class Factory {

    private Factory() {
    }

    public static Optional<IMessage> getInstance() {
        return Optional.of((msg) -> {
           System.out.println("消息发送" + msg);
        });
    }
}
