package strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Package: PACKAGE_NAME
 * @Description: 策略模式
 * @author: liuxin
 * @date: 17/2/27 下午3:58
 */
public class Zhaoyun {
    private final static Logger logger = LoggerFactory.getLogger(Zhaoyun.class);

    /**
     * 策略模式和简单工厂模式区别：
     * 简单工厂模式是根据条件创建响应的产品类对象
     * 策略模式是根据工厂类生产的对象进行操作，前者是条件，后者是对象
     * @param args
     */
    public static void main(String[] args) {
        Context context = new Context(new BackDoor());
        logger.info("第一种策略");
        context.operate();
        context=new Context(new BlackEnemy());
        logger.info("第二种策略");
        context.operate();
        context=new Context(new GivenGreenLight());
        logger.info("第三种策略");
        context.operate();
    }
}
