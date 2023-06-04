package _9_正则表达式;

public class RegDemo {
    public static void main(String[] args) {
        // JAVA中的正则表达式demo
        String str = "1234567890";
        // 判断是否是数字
        System.out.println(str.matches("\\d+"));

        stringRegDemo();
    }

    private static void stringRegDemo() {
        // String中和正则表达式相关的方法
        String str = "1234567890";
        // 将str中的数字替换为a
        System.out.println(str.replaceAll("\\d", "a"));
    }

    private static void regexDemo() {
        // 常用的regex包的相关方法：
        // Pattern类
        // Matcher类
    }
}
