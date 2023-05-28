package _6_对象克隆;

public class CopyTest {

    /*
    * Object类中的clone()方法是浅拷贝
    * */
    public static void main(String[] args) throws CloneNotSupportedException {
        Emp emp = new Emp("张三", 20);
        Emp emp2 = (Emp) emp.clone();
        System.out.println(emp);
        System.out.println(emp2);
    }
}
