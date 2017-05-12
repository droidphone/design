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
        mylistener.handleEvent(new MyEvent("name","name"));
    }


}
