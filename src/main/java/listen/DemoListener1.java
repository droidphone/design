package listen;

/**
 * @Package: listen
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/4/24 下午2:42
 */
public class DemoListener1 implements DemoListener {
    public void handleEvent(DemoEvent de) {
        System.out.println("Inside listener1...");
        de.say();//回调
    }
}
