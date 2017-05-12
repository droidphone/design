import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Package: PACKAGE_NAME
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/2/27 下午3:45
 */
@SpringBootApplication
@EnableScheduling
public class DesignApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignApplication.class,args);
    }
}
