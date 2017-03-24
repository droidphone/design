package strategy;

/**
 * @Package: strategy
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/2/27 下午3:55
 */
public class Context {
    private IStrategy iStrategy;
    public Context(IStrategy iStrategy){
        this.iStrategy=iStrategy;
    }
    public void operate(){
        this.iStrategy.operate();
    }
}
