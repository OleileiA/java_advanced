package _8_日期时间;

public class SimpleDateFormatDemo {

    /*
    * 简单来讲，这个类比较实用，适合字符串和日期对象之间的互相转换
    */
    public static void main(String[] args) {
        // 日期对象转换为字符串
        // 1. 创建日期对象
        java.util.Date date = new java.util.Date();
        // 2. 创建格式化对象
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 3. 调用format方法
        String str = sdf.format(date);
        System.out.println(str);

        // 字符串转换为日期对象
        // 1. 创建格式化对象
        java.text.SimpleDateFormat sdf2 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 2. 调用parse方法
        try {
            java.util.Date date2 = sdf2.parse("2019-12-12 12:12:12");
            System.out.println(date2);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }
}
