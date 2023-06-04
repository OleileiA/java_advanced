package base._3_Runtime;



public class RunTimeDemo {

/*
RunTime 类是Java中的一个系统类，它表示Java应用程序与其底层操作系统环境的连接。通过RunTime类，我们可以与底层操作系统进行交互，例如打开新进程、执行命令、获取内存使用情况等。具体来说，RunTime类提供了以下几个常用方法：
1. exec()：在单独的进程中执行指定的字符串命令。
2. gc()：运行垃圾回收器。
3. exit()：终止当前正在运行的Java虚拟机。
4. availableProcessors()：返回可用处理器的数量。
5. totalMemory()：返回当前Java虚拟机的堆内存总量。
6. freeMemory()：返回当前Java虚拟机的堆内存空闲量。
需要注意的是，RunTime类使用时需要特别谨慎，我们应该避免使用诸如“exec()”等方法，因为操作底层系统太过危险，可能会带来不可预测的后果。
*/

    /*
    * 由于运行时的状态是以进程为单位保存的，因此每一个JVM之中所创建的线程都将获得相同的RunTime实例。
    * 所以RunTime类是单例模式。
    * */
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("处理器数量：" + runtime.availableProcessors());
        System.out.println("空闲内存数：" + runtime.freeMemory());
        System.out.println("初始化内存：" + runtime.totalMemory());
        System.out.println("最大可用内存数：" + runtime.maxMemory());
    }

    /*
    * 一个JVM的最大可用内存为物理内存的1/4，初始化内存为物理内存的1/64。
    * 当空间不足的时候会动态的分配内存。
    *
    * Java中的GC属于守护线程，守护线程是伴随主线程存在的，其目的主要是进行垃圾收集和堆内存的释放。
    * */
}
