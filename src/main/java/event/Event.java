package event;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Package: event
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/5/16 上午9:29
 */
public class Event {
    private Object target;

    private String methodName;

    private Object[] param;


    public Event(Object target, String methodName, Object[] param) {
        this.target = target;
        this.methodName = methodName;
        this.param = param;
    }

    public void addEvent(Object target, String methodName, Object[] param) {
        this.target = target;
        this.methodName = methodName;
        this.param = param;
    }

    public Class[] getParamTypes() {
        Class[] paramTypes = null;
        for (int i = 0; i < param.length; i++) {
            paramTypes[i] = param[i].getClass();
        }
        return paramTypes;
    }

    public void invoke() {
        Method method = null;
        try {
            method = this.target.getClass().getMethod(this.methodName, getParamTypes());
            method.invoke(this.target, param);
        } catch (Exception e) {
            throw  new RuntimeException(e);
        }

    }


}
