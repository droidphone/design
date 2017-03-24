package singleton;

/**
 * @Package: singleton
 * @Description: 静态内部类单列
 * 饥寒模式；类加载时，就要加载，所以加载慢，但是得到快
 * 饱汉模式；类加载时，不实例，所以加载快，得到慢，要进行安全处理
 * 静态内部类；类加载时，就加载静态类，得到快，加载快。推荐这种
 * @author: liuxin
 * @date: 17/3/24 下午6:01
 */
public class Singleton {

    private Singleton(){
    }
    public static Singleton getInstance(){
        return SingletonHolder.sInstance;
    }
    private static class SingletonHolder {
        private static final Singleton sInstance = new Singleton();
    }
}
