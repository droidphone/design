package observer;

/**
 * @Package: rattlesnake.callback.core.observer
 * @Description: 被观察者
 * @author: liuxin
 * @date: 17/4/21 上午9:31
 */
public interface Subject {
    /**
     * 增加订阅者
     *
     * @param channel
     */
    void attach(ChannelObject channel);

    /**
     * @param channel
     */
    void attach(ChannelObject... channel);

    /**
     * 删除订阅者
     *
     * @param channel
     */
    void detach(ChannelObject channel);

    /**
     * 通知订阅者更新消息
     */
    void notify(String message);
}