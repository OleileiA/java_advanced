package base._8_日期时间;

import java.util.Date;

public class DateDemo {
    /*
    * Date类掌握这几个方法就可以了
    * */
    public static void main(String[] args) {
        long datetime = System.currentTimeMillis() - 10000;
        Date date1 = new Date(datetime);
        Date date2 = new Date();
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date1.before(date2));
        System.out.println(date1.after(date2));
    }
}
