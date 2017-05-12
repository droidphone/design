package observer2;

/**
 * @Package: rattlesnake.callback.core.observer
 * @Description: 具体的观察者
 * @author: liuxin
 * @date: 17/4/21 上午9:33
 */
public class ChannelObject implements Observer {

    private String name;

    public ChannelObject() {
    }

    public ChannelObject(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name+"收到了一条信息:" + message);
    }
}
