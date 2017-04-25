package listen1;

import sun.awt.windows.ThemeReader;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Package: listen1
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/4/25 下午4:44
 */
public class test2 {
    public static void main(String args[])throws Exception {
        ExecutorService threadPool= Executors.newCachedThreadPool();
        Map<Integer, String> map = new HashMap<>();
        Mylistener mylistener = new Mylistener(map);
        List DPMap = new ArrayList();
        DPMap.add(1);
        Thread.sleep(1000);
        DPMap.add(1); DPMap.add(1);
        Thread.sleep(1000);
        TimerTask task = new TimerTask() {
            String name= Thread.currentThread().getName();
            @Override
            public void run() {
                threadPool.execute(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("size:" + DPMap.size()+"^^^"+name+Thread.currentThread().getName());
                    }
                });

            }
        };
        DPMap.add(1); DPMap.add(1);
        Calendar calendar = Calendar.getInstance();
        Date firstTime = calendar.getTime();
        System.out.println(firstTime);
        Timer timer = new Timer();
        timer.schedule(task, firstTime, 1);
        Thread.sleep(1000);
        DPMap.add(1); DPMap.add(1);

        Thread.sleep(1000);
        DPMap.remove(1);
    }
}
