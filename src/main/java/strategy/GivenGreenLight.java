package strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Package: strategy
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/2/27 下午3:54
 */
public class GivenGreenLight implements IStrategy {
    private final static Logger logger= LoggerFactory.getLogger(GivenGreenLight.class);
    @Override
    public void operate() {
       logger.info("求吴国太开个绿灯，放行！");
    }
}
