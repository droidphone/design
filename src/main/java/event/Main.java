package event;

/**
 * @Package: event
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/5/16 上午9:48
 */
public class Main {
    public static void main(String[] args) {
        //创建一个尽职尽责的放哨者
        Notifier goodNotifier = new GoodNotifier();

//创建一个玩游戏的同学，开始玩游戏
        WathcTvPerson playingGameListener = new WathcTvPerson();

//创建一个看电视的同学，开始看电视
        NBAPerson watchingTVListener = new NBAPerson();
//玩游戏的同学告诉放哨的同学，老师来了告诉一下
        goodNotifier.addListener(playingGameListener, "shutDownTV", "老师来了");
//看电视的同学告诉放哨的同学，老师来了告诉一下
        goodNotifier.addListener(watchingTVListener, "shutDownNba", "科比退役了");
        try {
            //一点时间后
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
//老师出现，放哨的人通知所有要帮忙的同学:老师来了
        goodNotifier.notifyX();
    }
}
