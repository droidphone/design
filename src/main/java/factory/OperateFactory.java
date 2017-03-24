package factory;

/**
 * @Package: factory
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/2/27 下午4:14
 */
public class OperateFactory {
    public static Operate createOperate(String operateStr) {
        Operate operate=null;
        switch (operateStr) {
            case "+":
                operate = new OperateAdd();
                break;
            case "-":
                operate = new OperateSub();
                break;
        }
        return operate;
    }
}
