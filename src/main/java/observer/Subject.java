package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: observer
 * @Description: 被观察者
 * @author: liuxin
 * @date: 17/3/24 下午5:16
 */
public interface Subject {
    /**
     * 增加订阅者
     *
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 删除订阅者
     *
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知订阅者更新消息
     */
    void notify(String message);
}
