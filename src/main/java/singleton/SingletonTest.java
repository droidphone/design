package singleton;

/**
 * @Package: singleton
 * @Description: 使用静态内部类单列
 * @author: liuxin
 * @date: 17/3/24 下午6:01
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);//true
    }
}
