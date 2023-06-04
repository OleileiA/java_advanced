package base._8_日期时间;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class LocalDateDemo {
    /*
    * LocalDate是Java 8中引入的日期类，它表示不带时区的日期。它的存在意义在于：
        1. 可读性更好：与使用Date和Calendar类相比，使用LocalDate更容易理解和使用，因为它没有复杂的时区和时间处理。
        2. 更加严格的类型检查：LocalDate提供了一系列的方法，可以有效地验证和处理日期，例如不允许存在错误的日期，如13月，而Date和Calendar类则不能这样做。
        3. 具有不可变性：LocalDate对象是不可变的，这意味着当你创建一个LocalDate对象时，它不会发生任何变化。这在并发编程中十分重要，可以大幅减少并发问题。
        4. 与其他Java 8日期和时间类的兼容性：LocalDate与Java 8中的其他日期和时间类，如LocalTime和LocalDateTime等，具有良好的兼容性。使用这些类可以使代码更加清晰可读，而且更加易于维护。
    */
    public static void main(String[] args) {
        // 获取当前日期
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 2020-04-07

        // 获取年月日
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        System.out.println(year + "-" + month + "-" + day); // 2020-4-7

        // 获取特定日期
        LocalDate localDate1 = LocalDate.of(2020, 4, 7);
        System.out.println(localDate1); // 2020-04-07

        // 比较日期
        LocalDate localDate2 = LocalDate.of(2020, 4, 7);
        System.out.println(localDate.equals(localDate2)); // true

        // 检查重复事件，如生日
        LocalDate localDate3 = LocalDate.of(2020, 4, 7);
        MonthDay birthday = MonthDay.of(localDate3.getMonth(), localDate3.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(LocalDate.now());
        System.out.println(currentMonthDay.equals(birthday)); // true

        test1();
        test2();
    }

    // LocalDate, LocalTime, LocalDateTime
    private static void test1() {
        // 获取当前日期
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // 2020-04-07

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // 16:00:00.000

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // 2020-04-07T16:00:00.000
    }

    private static void test2() {
        // 获取年月日
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        System.out.println(year + "-" + month + "-" + day); // 2020-4-7

        // 获取星期几
        int week = localDate.getDayOfWeek().getValue();
        System.out.println(week); // 2

        // 这个月的第几周
        System.out.println("这个月第几周 : " + localDate.get(ChronoField.ALIGNED_WEEK_OF_MONTH));
        System.out.println("这个年第几周 : " + localDate.get(ChronoField.ALIGNED_WEEK_OF_YEAR));
        System.out.println("这个年第几天 : " + localDate.getDayOfYear());
    }
}
