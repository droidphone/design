package listen;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Package: listen
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/4/24 下午2:39
 */
public class DemoSource {
    private Vector repository=new Vector();
    public void addDemoListener(DemoListener d1){
        repository.addElement(d1);
    }

    public void notifyDemoEvent(){
        Enumeration enu=repository.elements();
        while (enu.hasMoreElements()){
            DemoListener dl = (DemoListener)enu.nextElement();
            dl.handleEvent(new DemoEvent(this));
        }
    }
}
