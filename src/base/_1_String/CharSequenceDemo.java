package base._1_String;

public class CharSequenceDemo {

    /*
    * 为了统一字符串的操作标准，Java提供了CharSequence接口，该接口定义了字符串的基本操作方法。
    * String, StringBuilder, StringBuffer都实现了该接口，因此这三种类型的字符串都可以使用CharSequence接口的方法。
    * */
    public static void main(String[] args) {
        CharSequence cs = "Hello World";
        System.out.println(cs);
        System.out.println(cs.length());
        System.out.println(cs.charAt(0));
        System.out.println(cs.subSequence(0, 5));
        System.out.println(cs.toString());
    }
}
