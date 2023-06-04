package base._5_Cleaner;


public class CleanerDemo {

    /*
    * 在JVM中保存的每一个对象实例在被GC线程回收之后，
    * 都会调用finalize()方法，但是这个方法并不是在对象被回收之后立即调用，而是在下一次GC之前调用。
    * 但是如果在操作中出现了某些死锁或者其他问题，导致回收处理可能无法被正常执行，从而影响当前程序的执行性能。
    *
    * 所以从JDK9开始，可以单独的设计一个回收线程，专门负责回收处理，Cleaner类就是专门用来实现这个功能的。
    * */

    /*
    * 本程序中，我们创建了一个Book类，实现了Runnable多线程接口。
    * 将此线程对象注入Cleaner, 最后随着try-with-resources语句块的结束，线程对象会被自动回收。
    *
    * Runnable接口中的run()方法在调用Thread类的start()方法后，会在新的线程中执行。
    * 具体来说，当一个线程的start()方法被调用时，该线程会在新的、独立的线程中启动，
    * 并且会自动调用其关联的Runnable对象的run()方法。这个run()方法就是该线程的执行体，它在启动线程后会被执行到。
    * */
    public static void main(String[] args) {
        Book book = new Book();
        try (ThreadCleaner threadCleaner = new ThreadCleaner(book)) {
            book.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
