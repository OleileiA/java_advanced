package _10_程序国际化;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
    public static void main(String[] args) {
        // Locale是一个类，用来表示一个特定的地理、政治或文化地区。
        // 通过Locale可以获取到该地区的语言、国家、货币等信息。
        // Locale类提供了一些静态方法，可以获取到系统默认的Locale对象。
        // Locale本身不具有任何的逻辑性
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        System.out.println(locale.getCountry());
        System.out.println(locale.getLanguage());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayName());
        System.out.println(locale.getISO3Country());
        System.out.println(locale.getISO3Language());
        System.out.println(locale.getVariant());
        System.out.println(locale.getDisplayVariant());
        System.out.println(locale.getDisplayScript());
        System.out.println(locale.getScript());
        System.out.println(locale.getExtension('a'));
        System.out.println(locale.getExtensionKeys());
        System.out.println(locale.getUnicodeLocaleAttributes());
        System.out.println(locale.getUnicodeLocaleKeys());
        System.out.println(locale.getUnicodeLocaleType("nu"));

        format();
    }

    // 资源文件
    private static void resourceFile() {
        // 资源文件是一种特殊的文件，它的扩展名是.properties。
        // 资源文件的内容是键值对的形式，键和值之间使用等号连接。
        // 资源文件的命名规则：基本名称_语言代码_国家代码.properties
        // 例如：message_zh_CN.properties
        // 资源文件的加载方式：
        // 1. 使用ResourceBundle类
        // 2. 使用ResourceBundle.Control类
        // 3. 使用ResourceBundle.ControlProvider类

        // 读取资源文件：
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", Locale.CHINA);
        System.out.println(resourceBundle.getString("hello"));
    }

    // 文字格式化和数字格式化
    private static void format() {
        // 文字格式化
        // 1. 使用MessageFormat类
        String meg = "你好，{0}，你的年龄是{1}岁";
        String result = java.text.MessageFormat.format(meg, "张三", 20);
        System.out.println(result);

        // 2. 数字格式化
        NumberFormat numberFormat = NumberFormat.getInstance();
        System.out.println(numberFormat.format(123456789));
        // 浮点数格式化
        NumberFormat numberFormat1 = NumberFormat.getInstance();
        numberFormat1.setMaximumFractionDigits(2);
        System.out.println(numberFormat1.format(123456789.123456789));
        // applyPattern()方法可以指定格式化的模式
        DecimalFormat numberFormat2 = (DecimalFormat) NumberFormat.getInstance();
        numberFormat2.applyPattern("###,###.###");
        System.out.println(numberFormat2.format(123456789.123456789));
    }
}
