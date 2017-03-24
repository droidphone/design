package strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Package: strategy
 * @Description: 策略
 * @author: liuxin
 * @date: 17/2/27 下午3:54
 */
public class BackDoor implements IStrategy {
    private final static Logger logger= LoggerFactory.getLogger(BackDoor.class);
    @Override
    public void operate() {
        logger.info("找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备...");
    }
}
