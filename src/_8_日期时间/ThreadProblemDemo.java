package _8_日期时间;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ThreadProblemDemo {
    public static void main(String[] args) {
//        simpleDateFormatSolution();
        localDateTimeSolution();
    }

    /*
    * 在多线程的情况下，使用SimpleDateFormat会出现多个SimpleDateFormat实例的问题
    * */
    private void SimpleDateFormatProblem() {
        // 假设多个线程执行同一个方法
        // 那么这里会产生多个SimpleDateFormat实例
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(new Date());
        System.out.println(dateStr);
    }

    /*
    * 可以采用多个线程共享同一个SimpleDateFormat实例的方式解决
    * 但是因为SimpleDateFormat是线程不安全的，所以下面的转化可能会导致报错
    * 每个线程都可以轻松地访问同一实例中的日期格式化程序，这可能导致在不同线程之间出现混乱的日期格式。
    * 尤其是，在多线程的环境中，如果多个线程同时访问同一实例的方法，则可能导致一些线程拿到的数据是错误的，
    * 或者在解析时间时出现异常。
    */
    private static void simpleDateFormatSolution() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    // String dateStr = sdf.format(new Date());
                    // System.out.println(dateStr);
                    System.out.println(sdf.parse("2020-01-01 00:00:00"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }


    /*
    *  当我们使用LocalDateTime类创建对象时，它会返回一个不可变的对象，该对象的方法也是线程安全的。因为LocalDateTime的所有属性都是final类型（也就是不可修改的），所以一旦对象被创建，它的值就不能被更改了。
    *  SimpleDateFormat类则不同，在多线程环境下，如果多个线程共享一个实例，可能导致内部状态的混乱，

     */
    private static void localDateTimeSolution() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ZoneId zoneId = ZoneId.systemDefault();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                String dateStr = dateTimeFormatter.format(new Date().toInstant().atZone(zoneId));
                System.out.println(dateStr);
            }).start();
        }
    }
}
