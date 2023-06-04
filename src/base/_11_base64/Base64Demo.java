package base._11_base64;

import java.util.Base64;

public class Base64Demo {
    // base64主要用于对敏感数据的加密传输
    public static void main(String[] args) {
        String str = "Hello World";
        String encodedString = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encodedString);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString);
    }
}
