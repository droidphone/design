package observer;


import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: rattlesnake.callback.core.observer
 * @Description: 封装失败连接，重试
 * @author: liuxin
 * @date: 17/4/21 上午9:29
 */
public class SubscriptionSubject implements Subject {
    private static final Logger logger = LoggerFactory.getLogger(SubscriptionSubject.class);
    private static final Gson gson = new Gson();
    private List<ChannelObject> channelList = new ArrayList<ChannelObject>();
    private static SubscriptionSubject ourInstance = null;

    private SubscriptionSubject() {

    }

    public static SubscriptionSubject getInstance() {
        if (ourInstance instanceof SubscriptionSubject) {
            return ourInstance;
        } else {
            ourInstance = new SubscriptionSubject();
        }
        return ourInstance;
    }

    /**
     * 添加监控
     *
     * @param channel
     */
    public void attach(ChannelObject channel) {
        if (!channelList.contains(channel)) {
            channelList.add(channel);
        }
    }

    /**
     * 可变参数监控
     *
     * @param channel
     */
    public void attach(ChannelObject... channel) {
        for (ChannelObject channelObject : channel) {
            if (!channelList.contains(channelObject)) {
                channelList.add(channelObject);
            }
        }
    }

    /**
     * 移除
     *
     * @param channel
     */
    public void detach(ChannelObject channel) {
        if (channelList.contains(channel)) {
            channelList.remove(channel);
        }

    }

    /**
     * @param
     */
    public void notify(String message) {
        if (channelList.size() > 0) {
            for (ChannelObject channelWrapper : channelList) {
                channelWrapper.update(message);
            }
        }
    }

    public static void main(String[] args) {
        ChannelObject channelObject1 = new ChannelObject("小明");
        ChannelObject channelObject2 = new ChannelObject("小蓝");
        ChannelObject channelObject3 = new ChannelObject("小张");
        ChannelObject channelObject4 = new ChannelObject("小红");
        SubscriptionSubject subscriptionSubject = getInstance();
        subscriptionSubject.attach(channelObject1, channelObject2, channelObject3, channelObject4);
        subscriptionSubject.notify("明天加班，请大家保持手机开机");

    }
}

