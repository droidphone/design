package filter;

/**
 * @Package: filter
 * @Description: 过滤器模式
 * @author: liuxin
 * @date: 17/3/24 下午6:54
 */
public class Test {

    public static void main(String[] args) {
        String msg = "adfasdf,操,爱上对方答复 < 敏感 >";
        MyFilter myFilter = new MyFilter();
        myFilter.setMsg(msg);
        msg = myFilter.process();
        System.out.println(msg);
    }
}
