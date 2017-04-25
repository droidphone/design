package listen1;

import java.util.EventListener;

/**
 * @Package: listen1
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/4/25 下午4:41
 */
public interface MyEventListener extends EventListener {
    void handleEvent(MyEvent me);
}