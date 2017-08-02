package chain;

/**
 * @Package: chain
 * @Description: ${todo}
 * @author: liuxin
 * @date: 2017/8/2 下午2:28
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
