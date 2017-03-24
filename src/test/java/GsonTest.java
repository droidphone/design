import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @Package: PACKAGE_NAME
 * @Description: 格式化输出Gson
 * @author: liuxin
 * @date: 17/3/1 下午5:16
 */
public class GsonTest {
    @Test
    public void testGson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Properties properties = System.getProperties();
        Set set = properties.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = (String)properties.get(key);
            System.out.println(key+"---"+value);
        }
    }
}
