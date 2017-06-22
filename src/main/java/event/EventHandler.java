package event;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: event
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/5/16 上午9:38
 */
public class EventHandler {
    List<Event> events=new ArrayList<>();

    public void addLister(Object target, String methodName, Object[] param) {
        Event event = new Event(target, methodName, param);
        events.add(event);
    }

    public void notifyX(){
        for (Event e:events){
            e.invoke();
        }
    }
}
