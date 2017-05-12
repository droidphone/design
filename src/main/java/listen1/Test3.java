package listen1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Package: listen1
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/4/26 上午9:31
 */
public class Test3 {
    static {

            System.out.println("静态线程");

    }
    public static void main(String[] args) throws Exception {

        List list = new ArrayList();
        test(list);
        list.add("liuxin1");
        Thread.sleep(2000);
        list.add("liuxin");
        Thread.sleep(2000);
        list.add("test");

    }

    public static void test(List list) throws Exception {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                if (list.contains("liuxin")) {
                    System.out.println("================包含================");
                    list.remove("liuxin");
                    list.add("test");
                }else {

                }

            }
        }, 0, 1, TimeUnit.MILLISECONDS);
    }
}
