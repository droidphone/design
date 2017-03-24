package filter;

/**
 * @Package: filter
 * @Description: 过滤器,允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
 * @author: liuxin
 * @date: 17/3/24 下午6:53
 */
public class MyFilter {

    private String msg;

    /**
     * 问题：这里的过滤规则会老是被动态的指定
     * @return
     */
    public String process(){
        //处理html tag
        msg = msg.replace("<", "[")
                .replace(">", "]");

        //process sensetive word
        msg = msg.replace("敏感", "**");
        msg=msg.replace("操","*");

        return msg;
    }

    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
}
