package factory;

/**
 * @Package: factory
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/2/27 下午4:18
 */
public class OperateSub implements Operate{
    @Override
    public int operta(int a, int b) {
        return a - b;
    }
}
