package observer;

/**
 * @Package: observer
 * @Description: 测试
 * @author: liuxin
 * @date: 17/3/24 下午5:24
 */
public class Client {
    public static void main(String[] args) {
        //被观察者里面定义了被观察查着的集合，添加了，观察者的时候，就会添加到集合，通知的时候，遍历通知每个被观察者
        SubscriptionSubject mSubscriptionSubject=new SubscriptionSubject();

        //创建微信用户
        WeixinUser user1=new WeixinUser("杨影枫");
        WeixinUser user2=new WeixinUser("月眉儿");
        WeixinUser user3=new WeixinUser("紫轩");
        //订阅公众号
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);
        //公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.notify("刘望舒的专栏更新了");
    }
}
