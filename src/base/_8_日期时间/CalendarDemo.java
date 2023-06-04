package base._8_日期时间;

import java.util.Calendar;

public class CalendarDemo {

    /*
    * 日历类，关于日期和时间的类，使用这个而不是Date类更加方便
    * */
    public static void main(String[] args) {
        // 获取当前时间
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        System.out.println(calendar);

        // 获取年
        int year = calendar.get(java.util.Calendar.YEAR);
        System.out.println(year);

        // 获取月
        int month = calendar.get(java.util.Calendar.MONTH);
        System.out.println(month);

        // 获取日
        int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
        System.out.println(day);

        // 获取时
        int hour = calendar.get(java.util.Calendar.HOUR_OF_DAY);
        System.out.println(hour);

        // 获取分
        int minute = calendar.get(java.util.Calendar.MINUTE);
        System.out.println(minute);

        // 获取秒
        int second = calendar.get(java.util.Calendar.SECOND);
        System.out.println(second);

        // 获取毫秒
        int millisecond = calendar.get(java.util.Calendar.MILLISECOND);
        System.out.println(millisecond);

        // 设置年
        calendar.set(java.util.Calendar.YEAR, 2020);
        System.out.println(calendar.get(java.util.Calendar.YEAR));

        // 设置月
        calendar.set(java.util.Calendar.MONTH, 11);
        System.out.println(calendar.get(java.util.Calendar.MONTH));

        // 设置日
        calendar.set(java.util.Calendar.DAY_OF_MONTH, 31);
        System.out.println(calendar.get(java.util.Calendar.DAY_OF_MONTH));

        // 设置时
        calendar.set(java.util.Calendar.HOUR_OF_DAY, 23);
        System.out.println(calendar.get(java.util.Calendar.HOUR_OF_DAY));

        // 设置分
        calendar.set(java.util.Calendar.MINUTE, 59);
        System.out.println(calendar.get(java.util.Calendar.MINUTE));

        // 设置秒
        calendar.set(java.util.Calendar.SECOND, 59);
        System.out.println(calendar.get(java.util.Calendar.SECOND));

        // 设置毫秒
        calendar.set(java.util.Calendar.MILLISECOND, 999);
        System.out.println(calendar.get(java.util.Calendar.MILLISECOND));

        // 设置年月日时分秒毫秒
        calendar.set(2020, Calendar.DECEMBER, 31, 23, 59, 59);
        System.out.println(calendar.get(java.util.Calendar.YEAR));
        System.out.println(calendar.get(java.util.Calendar.MONTH));
        System.out.println(calendar.get(java.util.Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(java.util.Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(java.util.Calendar.MINUTE));
    }
}
