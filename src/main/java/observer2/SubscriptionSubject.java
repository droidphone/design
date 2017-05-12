package observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: observer
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/3/24 下午5:23
 */
public class SubscriptionSubject implements Subject {
    //储存订阅公众号的微信用户
    private List<Observer> weixinUserlist = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weixinUserlist.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserlist.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUserlist) {
            observer.update(message);
        }
    }
}
