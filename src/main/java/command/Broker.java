package command;

/**
 * @Package: command
 * @Description: ${todo}
 * @author: liuxin
 * @date: 2017/8/2 下午2:47
 */
import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}