package strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Package: strategy
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/2/27 下午3:55
 */
public class BlackEnemy implements IStrategy {
    private final static Logger logger= LoggerFactory.getLogger(BlackEnemy.class);
    @Override
    public void operate() {
        logger.info("孙夫人断后，挡住追兵...");
    }
}
