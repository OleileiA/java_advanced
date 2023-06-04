package base._7_数字操作类;

public class MathDemo {
    public static void main(String[] args) {
        // 1. Math类的常量
        System.out.println("Math类的常量：");
        System.out.println("Math.E = " + Math.E);
        System.out.println("Math.PI = " + Math.PI);

        // 2. Math类的方法
        System.out.println("Math类的方法：");
        System.out.println("Math.abs(-1) = " + Math.abs(-1));
        System.out.println("Math.ceil(1.1) = " + Math.ceil(1.1));
        System.out.println("Math.floor(1.9) = " + Math.floor(1.9));
        System.out.println("Math.max(1, 2) = " + Math.max(1, 2));
        System.out.println("Math.min(1, 2) = " + Math.min(1, 2));
        System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3));
        System.out.println("Math.random() = " + Math.random());
        System.out.println("Math.round(1.5) = " + Math.round(1.5));
        System.out.println("Math.sqrt(4) = " + Math.sqrt(4));
    }

    /*
    * 四舍五入
    * */
    public static double round(double num, int scale) {
        return Math.round(num * Math.pow(10, scale)) / Math.pow(10, scale);
    }

    /*
    * 随机数
    * */
    public static int random(int min, int max) {
        // random.nextInt(100) 生成 [0, 100) 的随机数
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
