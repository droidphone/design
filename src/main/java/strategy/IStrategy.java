package strategy;

/**
 * @Package: strategy
 * @Description: 策略接口
 * @author: liuxin
 * @date: 17/2/27 下午3:47
 * 参考http://yangguangfu.iteye.com/blog/815107//
 * 故事情景:刘备要到江东娶老婆了，走之前诸葛亮给赵云（伴郎）三个锦囊妙计，说是按天机拆开能解决棘手问题，嘿，还别说，真解决了大问题，搞到最后是周瑜陪了夫人又折兵，那咱们先看看这个场景是什么样子的。
 * <p>
 * 先说说这个场景中的要素：三个妙计，一个锦囊，一个赵云，妙计是亮哥给的，妙计放在锦囊里，俗称就是锦囊妙计嘛，那赵云就是一个干活的人，从锦囊取出妙计，执行，然后获胜。用java程序怎么表现这些呢？
 */
public interface IStrategy {
    void operate();
}
