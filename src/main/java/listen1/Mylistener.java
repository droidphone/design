package listen1;

import java.util.Map;

/**
 * @Package: listen1
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/4/25 下午4:43
 */
class Mylistener implements MyEventListener {
    public Map<Integer, String> map = null;
    public int i = 0;

    public Mylistener(Map<Integer, String> map) {
        this.map = map;
        MyEventSource mes = new MyEventSource();
        mes.addMyEventListener(this);
        mes.setName("niu");
    }

    //实现接口中的方法
    public void handleEvent(MyEvent me) {
        System.out.println("me.getSource()  " + me.getSource());
        System.out.println("me.getsName()  " + me.getsName());
        //此处可以将写，将监听到的对象存入map中
        map.put(++i, me.getsName());
    }
}