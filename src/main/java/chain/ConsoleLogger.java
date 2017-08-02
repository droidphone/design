package chain;

/**
 * @Package: chain
 * @Description: ${todo}
 * @author: liuxin
 * @date: 2017/8/2 下午2:27
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}