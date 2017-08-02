package command;

/**
 * @Package: command
 * @Description: ${todo}
 * @author: liuxin
 * @date: 2017/8/2 下午2:46
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}