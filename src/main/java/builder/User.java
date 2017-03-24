package builder;

/**
 * @Package: builder
 * @Description: ${todo}
 * @author: liuxin
 * @date: 17/3/24 下午6:13
 */
public class User {
    private String name;
    private String age;
    private String address;
    private String sex;
    private String friendName;

    public User(String name, String age, String address, String sex, String friendName) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
        this.friendName = friendName;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", friendName='" + friendName + '\'' +
                '}';
    }
}
