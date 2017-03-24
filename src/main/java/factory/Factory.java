package factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Package: PACKAGE_NAME
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/2/27 下午4:24
 */
public class Factory {
    private final static Logger logger = LoggerFactory.getLogger(Factory.class);

    /**
     * 本方法是简单工厂，根据条件获得产品
     * 工厂方法，为每个产品创建工厂实体类，直接new 出来产品的工厂，然后调用方法
     *
     * @param args
     */
    public static void main(String[] args) {
        Operate operate = OperateFactory.createOperate("+");
        logger.info("加:" + operate.operta(1, 2));
        operate = OperateFactory.createOperate("-");
        logger.info("减:" + operate.operta(1, 2));
    }
}
