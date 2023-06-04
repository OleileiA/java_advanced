package base._4_System;

public class SystemDemo {
    public static void main(String[] args) {
        // System类的常用方法demo:
        // 1. System.currentTimeMillis() 获取当前时间毫秒值
        long start = System.currentTimeMillis();
        System.out.println(start);


        // 2. 数组的复制
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[5];
        System.arraycopy(arr1, 0, arr2, 0, 5);

        // 3. System.exit(0) 退出JVM，实际是调用的Runtime.getRuntime().exit(0)
        System.exit(0);
    }
}
