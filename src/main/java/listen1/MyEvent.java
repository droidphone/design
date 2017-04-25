package listen1;

import java.util.EventObject;

/**
 * @Package: listen1
 * @Description: 自定义事件
 * @author: liuxin
 * @date: 17/4/25 下午3:59
 */
//自定义的事件状态对象类
class MyEvent extends EventObject {
    private Object obj;
    //此监听对象可以是自定义对象
    private String sName;

    public MyEvent(Object source, String sName) {
        super(source);
        this.obj = source;
        this.sName = sName;
    }

    public Object getObj() {
        return obj;
    }

    public String getsName() {
        return sName;
    }
}