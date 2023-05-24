package _1_String;

public class StringBuilderDemo {
    /*
    * StringBuilder类是一个可变的字符串类，它是StringBuffer类的简易替换，
    * 它的内部实现也是使用字符数组来存储字符串，但是它没有StringBuffer类的同步控制，因此效率更高。
    * StringBuilder中的方法没有使用synchronized， 非线程安全。
    * */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb);
    }
/*
线程安全是指在多线程并发访问时，对于共享数据或资源的操作，能够保证多个线程执行结果的正确性，以及程序逻辑的正确性。当多个线程同时访问共享资源时，如果没有进行合理的同步控制，可能会出现数据竞争的情况，导致程序崩溃或运行结果不正确。
synchronized是Java语言提供的一种同步机制，主要用于控制多个线程对共享资源的访问，保证了线程的原子性和可见性，并防止了多线程并发访问时的数据竞争问题，从而保证了程序的正确性和稳定性。
在Java中，synchronized可以用于三种情况：
1. 同步代码块(synchronized block)：使用synchronized修饰的代码块，用于对共享数据或资源进行同步控制。
2. 同步方法(synchronized method)：使用synchronized修饰的方法，可以将整个方法作为同步代码块，以保证对共享数据或资源的同步访问。
3. 静态同步方法(static synchronized method)：使用synchronized修饰的静态方法，可以将整个静态方法作为同步代码块，用于对所有对象的共享数据或资源进行同步控制。
在使用synchronized机制时，Java会使用一个锁对象来保证同步的正确性。当一个线程进入一个synchronized代码块或方法时，会自动获取锁对象；当线程离开synchronized代码块或方法时，会自动释放锁对象。当其他线程进入synchronized代码块或方法时，如果锁对象已被占用，则会被阻塞，直到获取到锁对象。
总之，通过使用synchronized机制，我们可以保证线程之间对共享资源的访问是同步的，避免了数据竞争的问题，从而保证了程序的正确性和稳定性。
*/
}
