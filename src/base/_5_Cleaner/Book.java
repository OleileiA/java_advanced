package base._5_Cleaner;

public class Book implements Runnable {

    public Book() {
        System.out.println("用心编写了一门技术书籍");
    }


    public void read() {
        System.out.println("认真学习");
    }

    @Override
    public void run() {
        System.out.println("知识学习完毕");
    }
}
