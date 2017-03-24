package builder;

/**
 * @Package: builder
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/3/24 下午6:19
 */
public class Test {
    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder();
        userBuilder.setName("liuxin");
        userBuilder.setAddress("shagnhai");
        userBuilder.setSex("boy");
        userBuilder.setAge("21");
        userBuilder.setFriendName("x");
        User user=userBuilder.build();
        System.out.println(user);
    }
}
