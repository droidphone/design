package observer2;

/**
 * @Package: observer
 * @Description: 微信用户是每个具体观察者
 * @author: liuxin
 * @date: 17/3/24 下午5:19
 */
public class WeixinUser implements Observer {

    // 微信用户名
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
