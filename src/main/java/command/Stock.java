package command;

/**
 * @Package: command
 * @Description: ${todo}
 * @author: liuxin
 * @date: 2017/8/2 下午2:44
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name
                + " Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name
                + "  Quantity: " + quantity + " ] sold");
    }
}