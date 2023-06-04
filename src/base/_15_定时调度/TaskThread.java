package base._15_定时调度;

import java.util.Timer;
import java.util.TimerTask;

public class TaskThread extends TimerTask {
    /*
    * TimerTask是一个抽象类，实现了Runnable接口，所以TimerTask是一个线程
    * TimerTask类中有一个run()方法，当定时任务执行时，run()方法会被调用
    * */
    @Override
    public void run() {
        System.out.println("定时任务执行了");
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TaskThread(), 1000, 2000);
    }
}
